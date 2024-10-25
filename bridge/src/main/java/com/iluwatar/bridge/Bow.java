package com.iluwatar.bridge;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Bow.
 */
@Slf4j
@AllArgsConstructor

public class Bow implements Weapon {

  private final Enchantment enchantment;

  public void wield(){
    LOGGER.info("O arqueiro empunha o arco.");
    enchantment.onActivate();
  }

  public void aim(){
    LOGGER.info("O arqueiro mira em seu alvo.");
    enchantment.apply();
  }

  public void unwield(){
    enchantment.onDeactivate();
    LOGGER.info("O arqueiro guarda o arco.");
  }

  public void swing(){};

  public Enchantment getEnchantment (){ return enchantment; }

}
