package com.contrarywind.util;

import android.content.Context;

/**
 * @Auther: Benny
 * @CreateTime: 2022/11/21 17:34
 * @Description:
 **/
public class ScreenUtil {

    public static int dp2px(Context context,int dp){

        float density = context.getResources().getDisplayMetrics().density;

        return (int) (dp * density + 0.5f);
    }
}
