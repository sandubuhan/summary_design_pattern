package com.design_pattern.demo.combat.ratelimiter.one.alg;

import com.google.common.base.Stopwatch;
import org.assertj.core.util.VisibleForTesting;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author sandu
 * @Date 2022-05-29 19:19
 */

public class RateLimitAlg {
    /* timeout for {@code Lock.tryLock() }. */
    private static final long TRY_LOCK_TIMEOUT = 200L;  // 200ms.
    private Stopwatch stopwatch;
    private AtomicInteger currentCount = new AtomicInteger(0);
    private final int limit;
    private Lock lock = new ReentrantLock();

    public RateLimitAlg(int limit) {
        this(limit, Stopwatch.createStarted());
    }

    @VisibleForTesting
    protected RateLimitAlg(int limit, Stopwatch stopwatch) {
        this.limit = limit;
        this.stopwatch = stopwatch;
    }

    public boolean tryAcquire() throws Exception {
        int updatedCount = currentCount.incrementAndGet();
        if (updatedCount <= limit) {
            return true;
        }

        try {
            if (lock.tryLock(TRY_LOCK_TIMEOUT, TimeUnit.MILLISECONDS)) {
                try {
                    if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > TimeUnit.SECONDS.toMillis(1)) {
                        currentCount.set(0);
                        stopwatch.reset();
                    }
                    updatedCount = currentCount.incrementAndGet();
                    return updatedCount <= limit;
                } finally {
                    lock.unlock();
                }
            } else {
                throw new Exception("tryAcquire() wait lock too long:" + TRY_LOCK_TIMEOUT + "ms");
            }
        } catch (InterruptedException e) {
            throw new Exception("tryAcquire() is interrupted by lock-time-out.e=", e);
        }
    }
}