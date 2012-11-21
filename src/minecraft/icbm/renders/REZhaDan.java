package icbm.renders;

import icbm.ZhuYao;
import icbm.api.ICBM;
import icbm.zhapin.EZhaDan;
import icbm.zhapin.TZhaDan;
import icbm.zhapin.ZhaPin;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.Render;
import net.minecraft.src.RenderBlocks;

import org.lwjgl.opengl.GL11;

public class REZhaDan extends Render
{
	private RenderBlocks blockRenderer = new RenderBlocks();

	public REZhaDan()
	{
		this.shadowSize = 0.5F;
	}

	@Override
	public void doRender(Entity par1Entity, double x, double y, double z, float par8, float par9)
	{
		EZhaDan entityExplosive = (EZhaDan) par1Entity;

		Object[] data = ZhaPin.list[entityExplosive.explosiveID].getRenderData();

		if (data != null)
		{
			GL11.glPushMatrix();
			GL11.glTranslatef((float) x, (float) y + 1F, (float) z);
			this.loadTexture((String) data[1]);
			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
			((ICBMModelBase) data[0]).render(entityExplosive, (float) x, (float) y, (float) z, par8, par9, 0.0625F);
			GL11.glPopMatrix();
		}
		else
		{
			GL11.glPushMatrix();
			GL11.glTranslatef((float) x, (float) y, (float) z);
			float var10;

			if ((float) entityExplosive.fuse - par9 + 1.0F < 10.0F)
			{
				var10 = 1.0F - ((float) entityExplosive.fuse - par9 + 1.0F) / 10.0F;

				if (var10 < 0.0F)
				{
					var10 = 0.0F;
				}

				if (var10 > 1.0F)
				{
					var10 = 1.0F;
				}

				var10 *= var10;
				var10 *= var10;
				float var11 = 1.0F + var10 * 0.3F;
				GL11.glScalef(var11, var11, var11);
			}

			var10 = (1.0F - ((float) entityExplosive.fuse - par9 + 1.0F) / 100.0F) * 0.8F;
			this.loadTexture(ICBM.BLOCK_TEXTURE_FILE);
			this.blockRenderer.renderBlockAsItem(ZhuYao.bZha4Dan4, entityExplosive.explosiveID, entityExplosive.getBrightness(par9));

			if (entityExplosive.fuse / 5 % 2 == 0)
			{
				GL11.glDisable(GL11.GL_TEXTURE_2D);
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_DST_ALPHA);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, var10);
				this.blockRenderer.renderBlockAsItem(Block.tnt, 0, 1.0F);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				GL11.glDisable(GL11.GL_BLEND);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glEnable(GL11.GL_TEXTURE_2D);
			}

			GL11.glPopMatrix();
		}
	}

}