package org.runite.client;

import java.awt.*;
import java.util.Objects;

final class Class99 {

    static short[] aShortArray1398;
    static Class33 aClass33_1399;
    static RSInterface aClass11_1402;
    static int anInt1403 = -1;


    static void method1596(RSString var0, boolean var2) {
        try {
            if (var2) {
                if (HDToolKit.highDetail && GameShell.userUsingWinJS) {
                    try {
                        Class42.method1056(Signlink.aClass87_665.applet, new Object[]{var0.method1547(GameShell.anApplet_Sub1_2588.getCodeBase()).toString()});
                        return;
                    } catch (Throwable var6) {
                    }
                }

                try {
                    System.out.println("Trying this applet");
                    Objects.requireNonNull(GameShell.anApplet_Sub1_2588.getAppletContext()).showDocument(var0.method1547(GameShell.anApplet_Sub1_2588.getCodeBase()), "_blank");
                } catch (Exception var4) {
                }
            } else {
                try {
                    System.out.println("Trying this applet 2 99");
                    Objects.requireNonNull(GameShell.anApplet_Sub1_2588.getAppletContext()).showDocument(var0.method1547(GameShell.anApplet_Sub1_2588.getCodeBase()), "_top");
                } catch (Exception var5) {
                }
            }

        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "nf.C(" + (var0 != null ? "{...}" : "null") + ',' + var2 + ')');
        }
    }

    static Frame method1597(int var2, int var3, int var4, Signlink var5) {
        try {
            if (var5.method1432(false)) {
                if (0 == var2) {
                    Class106[] var6 = Unsorted.method596(var5);

                    boolean var7 = false;

                    for (Class106 class106 : var6) {
                        if (var4 == class106.anInt1447 && var3 == class106.anInt1449 && (!var7 || class106.anInt1450 > var2)) {
                            var2 = class106.anInt1450;
                            var7 = true;
                        }
                    }

                    if (!var7) {
                        return null;
                    }
                }

                Class64 var10 = var5.method1450(0, var2, var3, var4);

                while (0 == var10.anInt978) {
                    TimeUtils.sleep(10L);
                }

                Frame var11 = (Frame) var10.anObject974;
                if (null == var11) {
                    return null;
                } else if (2 == var10.anInt978) {
                    Unsorted.method593(var11, var5);
                    return null;
                } else {
                    return var11;
                }
            } else {
                return null;
            }
        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "nf.D(" + 2 + ',' + 0 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
        }
    }

}
