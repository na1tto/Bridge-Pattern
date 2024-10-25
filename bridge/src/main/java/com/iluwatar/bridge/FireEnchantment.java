package com.iluwatar.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * FireEnchantment.
 */
@Slf4j

public class FireEnchantment implements Enchantment {

  public void onActivate(){LOGGER.info("O encatamento cobre a arma com fogo. ");}

  public void apply(){LOGGER.info("O encantamento é disparado.");}

  public void onDeactivate(){LOGGER.info("O encantamento é disperçado lentamente.");}
}
