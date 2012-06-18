public class CommandSignListener extends PluginListener 
{
	public boolean onBlockRightClick(Player player, Block block, Item item)
	{
		if(block.getType() == 63 || block.getType() == 68)
		{
			Sign sign = (Sign)player.getWorld().getComplexBlock(block);
			if(sign != null)
			{
				if(sign.getText(0).equals("[Command]"))
				{
					String cmd = sign.getText(1);
					if(sign.getText(1).charAt(0) != '/')
					{
						cmd = "/"+cmd;
					}
					if(sign.getText(2) != null)
					{
						cmd += " " + sign.getText(2);
					}
					if(sign.getText(3) != null)
					{
						cmd += " " + sign.getText(3);
					}
					player.command(cmd);
				}
			}
		}
		return false;
	}
}
