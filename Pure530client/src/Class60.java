
final class Class60 {

   static int anInt930;
   private static Class94 aClass94_931 = Class3_Sub4.method108("Continue", (byte)-120);
   static int anInt932;
   static Class94 aClass94_933 = Class3_Sub4.method108("Ladevorgang )2 bitte warten Sie)3", (byte)-119);
   static int anInt934;
   static Class94 aClass94_935 = aClass94_931;
   static int anInt936;


   public static void method1206(byte var0) {
      try {
         int var1 = 50 % ((-41 - var0) / 57);
         aClass94_931 = null;
         aClass94_933 = null;
         aClass94_935 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ig.C(" + var0 + ')');
      }
   }

   static final void method1207(int var0) {
      try {
         for(int var1 = 0; ~var1 > ~Class163.anInt2046; ++var1) {
            int var2 = Class15.anIntArray347[var1];
            Class140_Sub4_Sub2 var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2];
            if(null != var3) {
               OutputStream_Sub1.method68(var3.aClass90_3976.anInt1245, 2279, var3);
            }
         }

         if(var0 > -4) {
            method1208((byte)25, 108);
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ig.A(" + var0 + ')');
      }
   }

   static final void method1208(byte var0, int var1) {
      try {
         if(-1 != var1) {
            if(Class130.aBooleanArray1703[var1]) {
               Class3_Sub13_Sub29.aClass153_3361.method2128(7561, var1);
               if(null != Class140.aClass11ArrayArray1834[var1]) {
                  boolean var2 = true;

                  for(int var3 = 0; Class140.aClass11ArrayArray1834[var1].length > var3; ++var3) {
                     if(Class140.aClass11ArrayArray1834[var1][var3] != null) {
                        if(~Class140.aClass11ArrayArray1834[var1][var3].anInt187 == -3) {
                           var2 = false;
                        } else {
                           Class140.aClass11ArrayArray1834[var1][var3] = null;
                        }
                     }
                  }

                  int var4 = 43 / ((-70 - var0) / 47);
                  if(var2) {
                     Class140.aClass11ArrayArray1834[var1] = null;
                  }

                  Class130.aBooleanArray1703[var1] = false;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ig.B(" + var0 + ',' + var1 + ')');
      }
   }

}
