package com.timmmion;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("knockback-stick");

  public void onEnable()
  {
    LOGGER.info("Knockback-Stick by Timmmion enabled!");
    ItemStack stack = new ItemStack(Material.STICK);
    stack.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);

    ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "knockback-stick"), stack);
    recipe.shape(
      "BBB",
      "BSB",
      "BBB"
    );

    ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
    book.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);

    recipe.setIngredient('B', book.getData());
    recipe.setIngredient('S', Material.STICK);
    Bukkit.addRecipe(recipe);

  }

  public void onDisable()
  {
    LOGGER.info("Knockback-Stick by Timmmion disabled!");
  }
}
