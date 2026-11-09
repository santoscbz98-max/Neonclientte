package br.neonclient;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.Minecraft;

public class NeonMenu extends GuiScreen {

    @Override
    public void initGui() {
        buttonList.clear();

        buttonList.add(new GuiButton(
            1,
            width / 2 - 100,
            height / 2,
            200,
            30,
            "Fechar Neon Menu"
        ));
    }

    @Override
    public void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            Minecraft.getMinecraft().displayGuiScreen(null);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();

        drawCenteredString(
            fontRendererObj,
            "NEON CLIENT",
            width / 2,
            height / 2 - 60,
            0x00FFFF
        );

        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
