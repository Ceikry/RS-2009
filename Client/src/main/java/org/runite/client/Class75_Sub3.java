package org.runite.client;

final class Class75_Sub3 extends Class75 {

    static AbstractSprite[] aAbstractSpriteArray2656;
    static int anInt2658;
    private final int anInt2649;
    private final int anInt2650;
    private final int anInt2652;
    private final int anInt2654;
    private final int anInt2657;
    private final int anInt2659;
    private final int anInt2661;
    private int anInt2655;

    Class75_Sub3(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        super(-1, var9, var10);

        try {
            this.anInt2657 = var2;
            this.anInt2659 = var7;
            this.anInt2655 = var5;
            this.anInt2654 = var1;
            this.anInt2650 = var8;
            this.anInt2652 = var6;
            this.anInt2649 = var4;
            this.anInt2661 = var3;
        } catch (RuntimeException var12) {
            throw ClientErrorException.clientError(var12, "re.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
        }
    }

    static void method1346() {
        try {
            SweepReferenceCache.method174();
            SweepReferenceCache.method1027();
            SweepReferenceCache.method465();
            SweepReferenceCache.method474();
            SweepReferenceCache.method2025();
            SweepReferenceCache.method1711();
            SweepReferenceCache.method137();
            SweepReferenceCache.method795();
            SweepReferenceCache.method539();
            SweepReferenceCache.method188();
            SweepReferenceCache.method2260();
            SweepReferenceCache.method594();
            SweepReferenceCache.method595();
            SweepReferenceCache.method820();
            SweepReferenceCache.method953();
            SweepReferenceCache.method269();
            SweepReferenceCache.method1366();
            Class3_Sub13_Sub11.aReferenceCache_3130.sweep(5);
            Unsorted.aReferenceCache_1135.sweep(5);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "re.K(" + 26211 + ')');
        }
    }

    static AbstractSprite[] method1347() {
        try {
            AbstractSprite[] var1 = new AbstractSprite[Class95.anInt1338];

            for (int var2 = 0; Class95.anInt1338 > var2; ++var2) {
                byte[] var4 = Class163_Sub1.aByteArrayArray2987[var2];
                int var3 = Unsorted.anIntArray3076[var2] * Class140_Sub7.anIntArray2931[var2];
                if (Class3_Sub13_Sub22.aBooleanArray3272[var2]) {
                    int[] var6 = new int[var3];
                    byte[] var5 = Class163_Sub3.aByteArrayArray3005[var2];

                    for (int var7 = 0; var3 > var7; ++var7) {
                        var6[var7] = Class3_Sub13_Sub29.bitwiseOr(Class3_Sub13_Sub38.spritePalette[Unsorted.bitwiseAnd(var4[var7], 255)], Unsorted.bitwiseAnd(-16777216, var5[var7] << 24));
                    }

                    if (HDToolKit.highDetail) {
                        var1[var2] = new Class3_Sub28_Sub16_Sub1_Sub1(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], var6);
                    } else {
                        var1[var2] = new Class3_Sub28_Sub16_Sub2_Sub1(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], var6);
                    }
                } else {
                    int[] var9 = new int[var3];

                    for (int var10 = 0; var3 > var10; ++var10) {
                        var9[var10] = Class3_Sub13_Sub38.spritePalette[Unsorted.bitwiseAnd(var4[var10], 255)];
                    }

                    if (HDToolKit.highDetail) {
                        var1[var2] = new HDSprite(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], var9);
                    } else {
                        var1[var2] = new Class3_Sub28_Sub16_Sub2(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], var9);
                    }
                }
            }

            Class39.method1035((byte) 106);
            return var1;
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "re.B(" + -26802 + ')');
        }
    }

    final void method1337(int var1, boolean var2, int var3) {
        try {
            int var4 = var3 * this.anInt2654 >> 12;
            int var6 = var3 * this.anInt2661 >> 12;
            int var7 = this.anInt2649 * var1 >> 12;
            int var5 = this.anInt2657 * var1 >> 12;
            int var8 = this.anInt2655 * var3 >> 12;
            int var9 = var1 * this.anInt2652 >> 12;
            int var10 = this.anInt2659 * var3 >> 12;
            int var11 = var1 * this.anInt2650 >> 12;
            Class108.method1652(var6, var10, var9, var11, var5, var4, var8, var7, this.anInt1104);
        } catch (RuntimeException var12) {
            throw ClientErrorException.clientError(var12, "re.E(" + var1 + ',' + var2 + ',' + var3 + ')');
        }
    }

    final void method1341(int var2, int var3) {
        try {

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "re.A(" + 2 + ',' + var2 + ',' + var3 + ')');
        }
    }

    final void method1335(int var1, int var2, int var3) {
        try {
            if (var3 != 4898) {
                this.anInt2655 = -64;
            }

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "re.D(" + var1 + ',' + var2 + ',' + var3 + ')');
        }
    }

}
