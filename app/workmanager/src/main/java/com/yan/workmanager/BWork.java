package com.yan.workmanager;

import android.content.Context;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class BWork extends Worker {
    public BWork(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override
    public Result doWork() {
        Log.i("1qaz2wsx", this.getClass().getSimpleName()+">>>doWork()");
        return Result.success();
    }
}
