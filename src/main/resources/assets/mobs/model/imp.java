// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class imp extends EntityModel<Entity> {
	private final ModelRenderer Bottom;
	private final ModelRenderer Wings;
	private final ModelRenderer bb_main;

	public imp() {
		textureWidth = 32;
		textureHeight = 32;

		Bottom = new ModelRenderer(this);
		Bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		Bottom.setTextureOffset(11, 13).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom.setTextureOffset(6, 18).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 18).addBox(1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(4, 18).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom.setTextureOffset(12, 0).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, 24.0F, -1.0F);
		Wings.setTextureOffset(12, 20).addBox(-4.0F, -10.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(0, 8).addBox(5.0F, -8.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(0, 13).addBox(4.0F, -9.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(18, 11).addBox(1.0F, -10.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(19, 19).addBox(-1.0F, -8.0F, 3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(20, 4).addBox(-1.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(18, 22).addBox(-5.0F, -9.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(22, 6).addBox(-6.0F, -8.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 8).addBox(-3.0F, -9.0F, -1.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 4).addBox(-4.0F, -9.0F, 0.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 13).addBox(3.0F, -9.0F, 0.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(20, 14).addBox(-3.0F, -15.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(2.0F, -15.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		Wings.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}