package org.runite.jagex;

import org.rs09.client.collections.Queue;

final class Class126 {

   int anInt1663;
   int anInt1664;
   static int anInt1665;
   static Queue aClass13_1666 = new Queue();
   int anInt1667;
   static int anInt1668 = -1;
   static Class3_Sub28_Sub17 aClass3_Sub28_Sub17_1669;
   int anInt1670;
   static Client aClient1671;
   static int anInt1672 = 0;
   int anInt1673;
   boolean aBoolean1674;
   int anInt1675;
   static int anInt1676 = 0;


   Class126(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      try {
         this.anInt1667 = var2;
         this.anInt1664 = var3;
         this.anInt1675 = var1;
         this.anInt1673 = var6;
         this.aBoolean1674 = var7;
         this.anInt1663 = var4;
         this.anInt1670 = var5;
      } catch (RuntimeException var9) {
         throw Class44.clientError(var9, "rh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

}
