package icbm.models;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMissileRejuvenation extends ModelBase
{
  //fields
    ModelRenderer MAIN_MODULE;
    ModelRenderer WING_B1;
    ModelRenderer WING_B2;
    ModelRenderer WING_B3;
    ModelRenderer WING_B4;
    ModelRenderer WING_BA1;
    ModelRenderer WING_BB1;
    ModelRenderer WING_BA2;
    ModelRenderer WING_BB2;
    ModelRenderer WING_TA1;
    ModelRenderer WING_TB1;
    ModelRenderer WING_TC3;
    ModelRenderer WING_TD1;
    ModelRenderer WING_TAC2;
    ModelRenderer WING_TBD2;
    ModelRenderer WING_TC1;
    ModelRenderer WING_TA3;
    ModelRenderer WING_TD3;
    ModelRenderer WING_TB3;
    ModelRenderer T_SUPPORT_1;
    ModelRenderer T_SUPPORT_2;
    ModelRenderer WARHEAD_SUPPORT_A1;
    ModelRenderer WARHEAD_SUPPORT_B1;
    ModelRenderer WARHEAD_SUPPORT_C1;
    ModelRenderer WRHEAD_SUPPORT_D1;
    ModelRenderer WARHEAD_SUPPORT_A2;
    ModelRenderer WARHEAD_SUPPORT_C2;
    ModelRenderer WARHEAD_SUPPORT_D2;
    ModelRenderer WARHEAD_SUPPORT_B2;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
  
  public ModelMissileRejuvenation()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      MAIN_MODULE = new ModelRenderer(this, 0, 0);
      MAIN_MODULE.addBox(-4F, 0F, -4F, 8, 64, 8);
      MAIN_MODULE.setRotationPoint(0F, -40F, 0F);
      MAIN_MODULE.setTextureSize(128, 128);
      MAIN_MODULE.mirror = true;
      setRotation(MAIN_MODULE, 0F, 0F, 0F);
      WING_B1 = new ModelRenderer(this, 34, 19);
      WING_B1.addBox(0F, 0F, 0F, 14, 10, 1);
      WING_B1.setRotationPoint(-7F, 14F, 6F);
      WING_B1.setTextureSize(128, 128);
      WING_B1.mirror = true;
      setRotation(WING_B1, 0F, 0F, 0F);
      WING_B2 = new ModelRenderer(this, 34, 19);
      WING_B2.addBox(0F, 0F, 0F, 14, 10, 1);
      WING_B2.setRotationPoint(-7F, 14F, -7F);
      WING_B2.setTextureSize(128, 128);
      WING_B2.mirror = true;
      setRotation(WING_B2, 0F, 0F, 0F);
      WING_B3 = new ModelRenderer(this, 34, 31);
      WING_B3.addBox(0F, 0F, 0F, 1, 10, 12);
      WING_B3.setRotationPoint(-7F, 14F, -6F);
      WING_B3.setTextureSize(128, 128);
      WING_B3.mirror = true;
      setRotation(WING_B3, 0F, 0F, 0F);
      WING_B4 = new ModelRenderer(this, 34, 31);
      WING_B4.addBox(0F, 0F, 0F, 1, 10, 12);
      WING_B4.setRotationPoint(6F, 14F, -6F);
      WING_B4.setTextureSize(128, 128);
      WING_B4.mirror = true;
      setRotation(WING_B4, 0F, 0F, 0F);
      WING_BA1 = new ModelRenderer(this, 72, 0);
      WING_BA1.addBox(-11F, 0F, -1F, 22, 12, 2);
      WING_BA1.setRotationPoint(0F, 12F, 0F);
      WING_BA1.setTextureSize(128, 128);
      WING_BA1.mirror = true;
      setRotation(WING_BA1, 0F, 0.7853982F, 0F);
      WING_BB1 = new ModelRenderer(this, 72, 0);
      WING_BB1.addBox(-11F, 0F, -1F, 22, 12, 2);
      WING_BB1.setRotationPoint(0F, 12F, 0F);
      WING_BB1.setTextureSize(128, 128);
      WING_BB1.mirror = true;
      setRotation(WING_BB1, 0F, -0.7853982F, 0F);
      WING_BA2 = new ModelRenderer(this, 34, 0);
      WING_BA2.addBox(-8F, -8F, -1F, 16, 16, 2);
      WING_BA2.setRotationPoint(0F, 12F, 0F);
      WING_BA2.setTextureSize(128, 128);
      WING_BA2.mirror = true;
      setRotation(WING_BA2, 0F, 0.7853982F, 0.7853982F);
      WING_BB2 = new ModelRenderer(this, 34, 0);
      WING_BB2.addBox(-8F, -8F, -1F, 16, 16, 2);
      WING_BB2.setRotationPoint(0F, 12F, 0F);
      WING_BB2.setTextureSize(128, 128);
      WING_BB2.mirror = true;
      setRotation(WING_BB2, 0F, -0.7853982F, 0.7853982F);
      WING_TA1 = new ModelRenderer(this, 22, 74);
      WING_TA1.addBox(0F, 0F, 0F, 2, 7, 5);
      WING_TA1.setRotationPoint(-1F, -23F, 4F);
      WING_TA1.setTextureSize(128, 128);
      WING_TA1.mirror = true;
      setRotation(WING_TA1, -0.5235988F, 0F, 0F);
      WING_TB1 = new ModelRenderer(this, 0, 103);
      WING_TB1.addBox(0F, 0F, 0F, 5, 8, 2);
      WING_TB1.setRotationPoint(4F, -23F, -1F);
      WING_TB1.setTextureSize(128, 128);
      WING_TB1.mirror = true;
      setRotation(WING_TB1, 0F, 0F, 0.5235988F);
      WING_TC3 = new ModelRenderer(this, 0, 81);
      WING_TC3.addBox(-1F, 0F, 0F, 2, 4, 5);
      WING_TC3.setRotationPoint(0F, -35F, -4F);
      WING_TC3.setTextureSize(128, 128);
      WING_TC3.mirror = true;
      setRotation(WING_TC3, -0.5235988F, 3.141593F, 0F);
      WING_TD1 = new ModelRenderer(this, 0, 103);
      WING_TD1.addBox(0F, 0F, -1F, 5, 8, 2);
      WING_TD1.setRotationPoint(-4F, -23F, 0F);
      WING_TD1.setTextureSize(128, 128);
      WING_TD1.mirror = true;
      setRotation(WING_TD1, 0F, 3.141593F, 0.5235988F);
      WING_TAC2 = new ModelRenderer(this, 0, 74);
      WING_TAC2.addBox(-1F, 0F, -8F, 2, 12, 16);
      WING_TAC2.setRotationPoint(0F, -32F, 0F);
      WING_TAC2.setTextureSize(128, 128);
      WING_TAC2.mirror = true;
      setRotation(WING_TAC2, 0F, 0F, 0F);
      WING_TBD2 = new ModelRenderer(this, 0, 74);
      WING_TBD2.addBox(-1F, 0F, -8F, 2, 12, 16);
      WING_TBD2.setRotationPoint(0F, -32F, 0F);
      WING_TBD2.setTextureSize(128, 128);
      WING_TBD2.mirror = true;
      setRotation(WING_TBD2, 0F, 1.570796F, 0F);
      WING_TC1 = new ModelRenderer(this, 22, 74);
      WING_TC1.addBox(-1F, 0F, 0F, 2, 8, 5);
      WING_TC1.setRotationPoint(0F, -23F, -4F);
      WING_TC1.setTextureSize(128, 128);
      WING_TC1.mirror = true;
      setRotation(WING_TC1, -0.5235988F, 3.141593F, 0F);
      WING_TA3 = new ModelRenderer(this, 0, 81);
      WING_TA3.addBox(-1F, 0F, 0F, 2, 4, 5);
      WING_TA3.setRotationPoint(0F, -35F, 4F);
      WING_TA3.setTextureSize(128, 128);
      WING_TA3.mirror = true;
      setRotation(WING_TA3, -0.5235988F, 0F, 0F);
      WING_TD3 = new ModelRenderer(this, 0, 74);
      WING_TD3.addBox(0F, 0F, -1F, 5, 4, 2);
      WING_TD3.setRotationPoint(-4F, -35F, 0F);
      WING_TD3.setTextureSize(128, 128);
      WING_TD3.mirror = true;
      setRotation(WING_TD3, 0F, 3.141593F, 0.5235988F);
      WING_TB3 = new ModelRenderer(this, 0, 74);
      WING_TB3.addBox(0F, 0F, 0F, 5, 4, 2);
      WING_TB3.setRotationPoint(4F, -35F, -1F);
      WING_TB3.setTextureSize(128, 128);
      WING_TB3.mirror = true;
      setRotation(WING_TB3, 0F, 0F, 0.5235988F);
      T_SUPPORT_1 = new ModelRenderer(this, 72, 16);
      T_SUPPORT_1.addBox(0F, 0F, 0F, 10, 1, 10);
      T_SUPPORT_1.setRotationPoint(-5F, -37F, -5F);
      T_SUPPORT_1.setTextureSize(128, 128);
      T_SUPPORT_1.mirror = true;
      setRotation(T_SUPPORT_1, 0F, 0F, 0F);
      T_SUPPORT_2 = new ModelRenderer(this, 72, 16);
      T_SUPPORT_2.addBox(0F, 0F, 0F, 10, 1, 10);
      T_SUPPORT_2.setRotationPoint(-5F, -41F, -5F);
      T_SUPPORT_2.setTextureSize(128, 128);
      T_SUPPORT_2.mirror = true;
      setRotation(T_SUPPORT_2, 0F, 0F, 0F);
      WARHEAD_SUPPORT_A1 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_A1.addBox(0F, 0F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_A1.setRotationPoint(-5F, -47F, -1F);
      WARHEAD_SUPPORT_A1.setTextureSize(128, 128);
      WARHEAD_SUPPORT_A1.mirror = true;
      setRotation(WARHEAD_SUPPORT_A1, 0F, 0F, 0F);
      WARHEAD_SUPPORT_B1 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_B1.addBox(0F, 0F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_B1.setRotationPoint(-1F, -47F, 3F);
      WARHEAD_SUPPORT_B1.setTextureSize(128, 128);
      WARHEAD_SUPPORT_B1.mirror = true;
      setRotation(WARHEAD_SUPPORT_B1, 0F, 0F, 0F);
      WARHEAD_SUPPORT_C1 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_C1.addBox(0F, 0F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_C1.setRotationPoint(3F, -47F, -1F);
      WARHEAD_SUPPORT_C1.setTextureSize(128, 128);
      WARHEAD_SUPPORT_C1.mirror = true;
      setRotation(WARHEAD_SUPPORT_C1, 0F, 0F, 0F);
      WRHEAD_SUPPORT_D1 = new ModelRenderer(this, 90, 38);
      WRHEAD_SUPPORT_D1.addBox(0F, 0F, 0F, 2, 6, 2);
      WRHEAD_SUPPORT_D1.setRotationPoint(-1F, -47F, -5F);
      WRHEAD_SUPPORT_D1.setTextureSize(128, 128);
      WRHEAD_SUPPORT_D1.mirror = true;
      setRotation(WRHEAD_SUPPORT_D1, 0F, 0F, 0F);
      WARHEAD_SUPPORT_A2 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_A2.addBox(0F, -6F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_A2.setRotationPoint(-5F, -47F, -1F);
      WARHEAD_SUPPORT_A2.setTextureSize(128, 128);
      WARHEAD_SUPPORT_A2.mirror = true;
      setRotation(WARHEAD_SUPPORT_A2, 0F, 0F, 0.5235988F);
      WARHEAD_SUPPORT_C2 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_C2.addBox(-2F, -6F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_C2.setRotationPoint(5F, -47F, -1F);
      WARHEAD_SUPPORT_C2.setTextureSize(128, 128);
      WARHEAD_SUPPORT_C2.mirror = true;
      setRotation(WARHEAD_SUPPORT_C2, 0F, 0F, -0.5235988F);
      WARHEAD_SUPPORT_D2 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_D2.addBox(0F, -6F, 0F, 2, 6, 2);
      WARHEAD_SUPPORT_D2.setRotationPoint(-1F, -47F, -5F);
      WARHEAD_SUPPORT_D2.setTextureSize(128, 128);
      WARHEAD_SUPPORT_D2.mirror = true;
      setRotation(WARHEAD_SUPPORT_D2, -0.5235988F, 0F, 0F);
      WARHEAD_SUPPORT_B2 = new ModelRenderer(this, 90, 38);
      WARHEAD_SUPPORT_B2.addBox(0F, -6F, -2F, 2, 6, 2);
      WARHEAD_SUPPORT_B2.setRotationPoint(-1F, -47F, 5F);
      WARHEAD_SUPPORT_B2.setTextureSize(128, 128);
      WARHEAD_SUPPORT_B2.mirror = true;
      setRotation(WARHEAD_SUPPORT_B2, 0.5235988F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 72, 32);
      Shape8.addBox(-2F, 0F, -2F, 4, 4, 4);
      Shape8.setRotationPoint(0F, -45F, 0F);
      Shape8.setTextureSize(128, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 90, 32);
      Shape9.addBox(-1F, 0F, -1F, 2, 2, 2);
      Shape9.setRotationPoint(0F, -48F, 0F);
      Shape9.setTextureSize(128, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    MAIN_MODULE.render(f5);
    WING_B1.render(f5);
    WING_B2.render(f5);
    WING_B3.render(f5);
    WING_B4.render(f5);
    WING_BA1.render(f5);
    WING_BB1.render(f5);
    WING_BA2.render(f5);
    WING_BB2.render(f5);
    WING_TA1.render(f5);
    WING_TB1.render(f5);
    WING_TC3.render(f5);
    WING_TD1.render(f5);
    WING_TAC2.render(f5);
    WING_TBD2.render(f5);
    WING_TC1.render(f5);
    WING_TA3.render(f5);
    WING_TD3.render(f5);
    WING_TB3.render(f5);
    T_SUPPORT_1.render(f5);
    T_SUPPORT_2.render(f5);
    WARHEAD_SUPPORT_A1.render(f5);
    WARHEAD_SUPPORT_B1.render(f5);
    WARHEAD_SUPPORT_C1.render(f5);
    WRHEAD_SUPPORT_D1.render(f5);
    WARHEAD_SUPPORT_A2.render(f5);
    WARHEAD_SUPPORT_C2.render(f5);
    WARHEAD_SUPPORT_D2.render(f5);
    WARHEAD_SUPPORT_B2.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
