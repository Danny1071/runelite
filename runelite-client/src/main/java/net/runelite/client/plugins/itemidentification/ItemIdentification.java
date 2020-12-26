/*
 * Copyright (c) 2019, Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.itemidentification;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.runelite.api.ItemID;

enum ItemIdentification
{
	//Seeds
	GUAM_SEED(Type.SEED, "Guam", "G", ItemID.GUAM_SEED),
	MARRENTILL_SEED(Type.SEED, "Marren", "M", ItemID.MARRENTILL_SEED),
	TARROMIN_SEED(Type.SEED, "Tarro", "TAR", ItemID.TARROMIN_SEED),
	HARRALANDER_SEED(Type.SEED, "Harra", "H", ItemID.HARRALANDER_SEED),
	RANARR_SEED(Type.SEED, "Ranarr", "R", ItemID.RANARR_SEED),
	TOADFLAX_SEED(Type.SEED, "Toad", "TOA", ItemID.TOADFLAX_SEED),
	IRIT_SEED(Type.SEED, "Irit", "I", ItemID.IRIT_SEED),
	AVANTOE_SEED(Type.SEED, "Avan", "A", ItemID.AVANTOE_SEED),
	KWUARM_SEED(Type.SEED, "Kwuarm", "K", ItemID.KWUARM_SEED),
	SNAPDRAGON_SEED(Type.SEED, "Snap", "S", ItemID.SNAPDRAGON_SEED),
	CADANTINE_SEED(Type.SEED, "Cadan", "C", ItemID.CADANTINE_SEED),
	LANTADYME_SEED(Type.SEED, "Lanta", "L", ItemID.LANTADYME_SEED),
	DWARF_WEED_SEED(Type.SEED, "Dwarf", "D", ItemID.DWARF_WEED_SEED),
	TORSTOL_SEED(Type.SEED, "Torstol", "TOR", ItemID.TORSTOL_SEED),
	POISON_IVY_SEED(Type.SEED, "Ivy", "I", ItemID.POISON_IVY_SEED),
	WHITEBERRY_SEED(Type.SEED, "White", "W", ItemID.WHITEBERRY_SEED),

	//Herbs
	GUAM(Type.HERB, "Guam", "G", ItemID.GUAM_LEAF, ItemID.GRIMY_GUAM_LEAF),
	MARRENTILL(Type.HERB, "Marren", "M", ItemID.MARRENTILL, ItemID.GRIMY_MARRENTILL),
	TARROMIN(Type.HERB, "Tarro", "TAR", ItemID.TARROMIN, ItemID.GRIMY_TARROMIN),
	HARRALANDER(Type.HERB, "Harra", "H", ItemID.HARRALANDER, ItemID.GRIMY_HARRALANDER),
	RANARR(Type.HERB, "Ranarr", "R", ItemID.RANARR_WEED, ItemID.GRIMY_RANARR_WEED),
	TOADFLAX(Type.HERB, "Toad", "TOA", ItemID.TOADFLAX, ItemID.GRIMY_TOADFLAX),
	IRIT(Type.HERB, "Irit", "I", ItemID.IRIT_LEAF, ItemID.GRIMY_IRIT_LEAF),
	AVANTOE(Type.HERB, "Avan", "A", ItemID.AVANTOE, ItemID.GRIMY_AVANTOE),
	KWUARM(Type.HERB, "Kwuarm", "K", ItemID.KWUARM, ItemID.GRIMY_KWUARM),
	SNAPDRAGON(Type.HERB, "Snap", "S", ItemID.SNAPDRAGON, ItemID.GRIMY_SNAPDRAGON),
	CADANTINE(Type.HERB, "Cadan", "C", ItemID.CADANTINE, ItemID.GRIMY_CADANTINE),
	LANTADYME(Type.HERB, "Lanta", "L", ItemID.LANTADYME, ItemID.GRIMY_LANTADYME),
	DWARF_WEED(Type.HERB, "Dwarf", "D", ItemID.DWARF_WEED, ItemID.GRIMY_DWARF_WEED),
	TORSTOL(Type.HERB, "Torstol", "TOR", ItemID.TORSTOL, ItemID.GRIMY_TORSTOL),

	ARDRIGAL(Type.HERB, "Ardrig", "ARD", ItemID.ARDRIGAL, ItemID.GRIMY_ARDRIGAL),
	ROGUES_PURSE(Type.HERB, "Rogue", "ROG", ItemID.ROGUES_PURSE, ItemID.GRIMY_ROGUES_PURSE),
	SITO_FOIL(Type.HERB, "Sito", "SF", ItemID.SITO_FOIL, ItemID.GRIMY_SITO_FOIL),
	SNAKE_WEED(Type.HERB, "Snake", "SW", ItemID.SNAKE_WEED, ItemID.GRIMY_SNAKE_WEED),
	VOLENCIA_MOSS(Type.HERB, "Volenc", "V", ItemID.VOLENCIA_MOSS, ItemID.GRIMY_VOLENCIA_MOSS),

	//Saplings
	OAK_SAPLING(Type.SAPLING, "Oak", "OAK", ItemID.OAK_SAPLING, ItemID.OAK_SEEDLING, ItemID.OAK_SEEDLING_W),
	WILLOW_SAPLING(Type.SAPLING, "Willow", "WIL", ItemID.WILLOW_SAPLING, ItemID.WILLOW_SEEDLING, ItemID.WILLOW_SEEDLING_W),
	MAPLE_SAPLING(Type.SAPLING, "Maple", "MAP", ItemID.MAPLE_SAPLING, ItemID.MAPLE_SEEDLING, ItemID.MAPLE_SEEDLING_W),
	YEW_SAPLING(Type.SAPLING, "Yew", "YEW", ItemID.YEW_SAPLING, ItemID.YEW_SEEDLING, ItemID.YEW_SEEDLING_W),
	MAGIC_SAPLING(Type.SAPLING, "Magic", "MAG", ItemID.MAGIC_SAPLING, ItemID.MAGIC_SEEDLING, ItemID.MAGIC_SEEDLING_W),
	REDWOOD_SAPLING(Type.SAPLING, "Red", "RED", ItemID.REDWOOD_SAPLING, ItemID.REDWOOD_SEEDLING, ItemID.REDWOOD_SEEDLING_W),
	SPIRIT_SAPLING(Type.SAPLING, "Spirit", "SPI", ItemID.SPIRIT_SAPLING, ItemID.SPIRIT_SEEDLING, ItemID.SPIRIT_SEEDLING_W),
	CRYSTAL_SAPLING(Type.SAPLING, "Crystal", "CRY", ItemID.CRYSTAL_SAPLING, ItemID.CRYSTAL_SEEDLING, ItemID.CRYSTAL_SEEDLING_W),

	APPLE_SAPLING(Type.SAPLING, "Apple", "APP", ItemID.APPLE_SAPLING, ItemID.APPLE_SEEDLING, ItemID.APPLE_SEEDLING_W),
	BANANA_SAPLING(Type.SAPLING, "Banana", "BAN", ItemID.BANANA_SAPLING, ItemID.BANANA_SEEDLING, ItemID.BANANA_SEEDLING_W),
	ORANGE_SAPLING(Type.SAPLING, "Orange", "ORA", ItemID.ORANGE_SAPLING, ItemID.ORANGE_SEEDLING, ItemID.ORANGE_SEEDLING_W),
	CURRY_SAPLING(Type.SAPLING, "Curry", "CUR", ItemID.CURRY_SAPLING, ItemID.CURRY_SEEDLING, ItemID.CURRY_SEEDLING_W),
	PINEAPPLE_SAPLING(Type.SAPLING, "Pine", "PINE", ItemID.PINEAPPLE_SAPLING, ItemID.PINEAPPLE_SEEDLING, ItemID.PINEAPPLE_SEEDLING_W),
	PAPAYA_SAPLING(Type.SAPLING, "Papaya", "PAP", ItemID.PAPAYA_SAPLING, ItemID.PAPAYA_SEEDLING, ItemID.PAPAYA_SEEDLING_W),
	PALM_SAPLING(Type.SAPLING, "Palm", "PALM", ItemID.PALM_SAPLING, ItemID.PALM_SEEDLING, ItemID.PALM_SEEDLING_W),
	DRAGONFRUIT_SAPLING(Type.SAPLING, "Dragon", "DRAG", ItemID.DRAGONFRUIT_SAPLING, ItemID.DRAGONFRUIT_SEEDLING, ItemID.DRAGONFRUIT_SEEDLING_W),

	TEAK_SAPLING(Type.SAPLING, "Teak", "TEAK", ItemID.TEAK_SAPLING, ItemID.TEAK_SEEDLING, ItemID.TEAK_SEEDLING_W),
	MAHOGANY_SAPLING(Type.SAPLING, "Mahog", "MAHOG", ItemID.MAHOGANY_SAPLING, ItemID.MAHOGANY_SEEDLING, ItemID.MAHOGANY_SEEDLING_W),
	CALQUAT_SAPLING(Type.SAPLING, "Calquat", "CALQ", ItemID.CALQUAT_SAPLING, ItemID.CALQUAT_SEEDLING, ItemID.CALQUAT_SEEDLING_W),
	CELASTRUS_SAPLING(Type.SAPLING, "Celas", "CEL", ItemID.CELASTRUS_SAPLING, ItemID.CELASTRUS_SEEDLING, ItemID.CELASTRUS_SEEDLING_W),

	//Ores
	COPPER_ORE(Type.ORE, "Copper", "COP", ItemID.COPPER_ORE),
	TIN_ORE(Type.ORE, "Tin", "TIN", ItemID.TIN_ORE),
	IRON_ORE(Type.ORE, "Iron", "IRO", ItemID.IRON_ORE),
	SILVER_ORE(Type.ORE, "Silver", "SIL", ItemID.SILVER_ORE),
	COAL_ORE(Type.ORE, "Coal", "COA", ItemID.COAL),
	GOLD_ORE(Type.ORE, "Gold", "GOL", ItemID.GOLD_ORE),
	MITHRIL_ORE(Type.ORE, "Mithril", "MIT", ItemID.MITHRIL_ORE),
	ADAMANTITE_ORE(Type.ORE, "Adaman", "ADA", ItemID.ADAMANTITE_ORE),
	RUNITE_ORE(Type.ORE, "Runite", "RUN", ItemID.RUNITE_ORE),

	RUNE_ESSENCE(Type.ORE, "R.Ess", "R.E.", ItemID.RUNE_ESSENCE),
	PURE_ESSENCE(Type.ORE, "P.Ess", "P.E.", ItemID.PURE_ESSENCE),

	PAYDIRT(Type.ORE, "Paydirt", "PAY", ItemID.PAYDIRT),
	AMETHYST(Type.ORE, "Amethy", "AME", ItemID.AMETHYST),
	LOVAKITE_ORE(Type.ORE, "Lovakit", "LOV", ItemID.LOVAKITE_ORE),
	BLURITE_ORE(Type.ORE, "Blurite", "BLU", ItemID.BLURITE_ORE),
	ELEMENTAL_ORE(Type.ORE, "Element", "ELE", ItemID.ELEMENTAL_ORE),
	DAEYALT_ORE(Type.ORE, "Daeyalt", "DAE", ItemID.DAEYALT_ORE),
	LUNAR_ORE(Type.ORE, "Lunar", "LUN", ItemID.LUNAR_ORE),

	//Gems
	SAPPHIRE(Type.GEM, "Sapphir", "S", ItemID.UNCUT_SAPPHIRE, ItemID.SAPPHIRE),
	EMERALD(Type.GEM, "Emerald", "E", ItemID.UNCUT_EMERALD, ItemID.EMERALD),
	RUBY(Type.GEM, "Ruby", "R", ItemID.UNCUT_RUBY, ItemID.RUBY),
	DIAMOND(Type.GEM, "Diamon", "DI", ItemID.UNCUT_DIAMOND, ItemID.DIAMOND),
	OPAL(Type.GEM, "Opal", "OP", ItemID.UNCUT_OPAL, ItemID.OPAL),
	JADE(Type.GEM, "Jade", "J", ItemID.UNCUT_JADE, ItemID.JADE),
	RED_TOPAZ(Type.GEM, "Topaz", "T", ItemID.UNCUT_RED_TOPAZ, ItemID.RED_TOPAZ),
	DRAGONSTONE(Type.GEM, "Dragon", "DR", ItemID.UNCUT_DRAGONSTONE, ItemID.DRAGONSTONE),
	ONYX(Type.GEM, "Onyx", "ON", ItemID.UNCUT_ONYX, ItemID.ONYX),
	ZENYTE(Type.GEM, "Zenyte", "Z", ItemID.UNCUT_ZENYTE, ItemID.ZENYTE),

	// Potions
	ATTACK(Type.POTION, "Att", "A", ItemID.ATTACK_POTION4, ItemID.ATTACK_POTION3, ItemID.ATTACK_POTION2, ItemID.ATTACK_POTION1),
	STRENGTH(Type.POTION, "Str", "S", ItemID.STRENGTH_POTION4, ItemID.STRENGTH_POTION3, ItemID.STRENGTH_POTION2, ItemID.STRENGTH_POTION1),
	DEFENCE(Type.POTION, "Def", "D", ItemID.DEFENCE_POTION4, ItemID.DEFENCE_POTION3, ItemID.DEFENCE_POTION2, ItemID.DEFENCE_POTION1),
	COMBAT(Type.POTION, "Com", "C", ItemID.COMBAT_POTION4, ItemID.COMBAT_POTION3, ItemID.COMBAT_POTION2, ItemID.COMBAT_POTION1),
	MAGIC(Type.POTION, "Magic", "M", ItemID.MAGIC_POTION4, ItemID.MAGIC_POTION3, ItemID.MAGIC_POTION2, ItemID.MAGIC_POTION1),
	RANGING(Type.POTION, "Range", "R", ItemID.RANGING_POTION4, ItemID.RANGING_POTION3, ItemID.RANGING_POTION2, ItemID.RANGING_POTION1),
	BASTION(Type.POTION, "Bastion", "B", ItemID.BASTION_POTION4, ItemID.BASTION_POTION3, ItemID.BASTION_POTION2, ItemID.BASTION_POTION1),
	BATTLEMAGE(Type.POTION, "BatMage", "B.M", ItemID.BATTLEMAGE_POTION4, ItemID.BATTLEMAGE_POTION3, ItemID.BATTLEMAGE_POTION2, ItemID.BATTLEMAGE_POTION1),

	SUPER_ATTACK(Type.POTION, "S.Att", "S.A", ItemID.SUPER_ATTACK4, ItemID.SUPER_ATTACK3, ItemID.SUPER_ATTACK2, ItemID.SUPER_ATTACK1),
	SUPER_STRENGTH(Type.POTION, "S.Str", "S.S", ItemID.SUPER_STRENGTH4, ItemID.SUPER_STRENGTH3, ItemID.SUPER_STRENGTH2, ItemID.SUPER_STRENGTH1),
	SUPER_DEFENCE(Type.POTION, "S.Def", "S.D", ItemID.SUPER_DEFENCE4, ItemID.SUPER_DEFENCE3, ItemID.SUPER_DEFENCE2, ItemID.SUPER_DEFENCE1),
	SUPER_COMBAT(Type.POTION, "S.Com", "S.C", ItemID.SUPER_COMBAT_POTION4, ItemID.SUPER_COMBAT_POTION3, ItemID.SUPER_COMBAT_POTION2, ItemID.SUPER_COMBAT_POTION1),
	SUPER_RANGING(Type.POTION, "S.Range", "S.Ra", ItemID.SUPER_RANGING_4, ItemID.SUPER_RANGING_3, ItemID.SUPER_RANGING_2, ItemID.SUPER_RANGING_1),
	SUPER_MAGIC(Type.POTION, "S.Magic", "S.M", ItemID.SUPER_MAGIC_POTION_4, ItemID.SUPER_MAGIC_POTION_3, ItemID.SUPER_MAGIC_POTION_2, ItemID.SUPER_MAGIC_POTION_1),

	DIVINE_SUPER_ATTACK(Type.POTION, "S.Att", "S.A", ItemID.DIVINE_SUPER_ATTACK_POTION4, ItemID.DIVINE_SUPER_ATTACK_POTION3, ItemID.DIVINE_SUPER_ATTACK_POTION2, ItemID.DIVINE_SUPER_ATTACK_POTION1),
	DIVINE_SUPER_DEFENCE(Type.POTION, "S.Def", "S.D", ItemID.DIVINE_SUPER_DEFENCE_POTION4, ItemID.DIVINE_SUPER_DEFENCE_POTION3, ItemID.DIVINE_SUPER_DEFENCE_POTION2, ItemID.DIVINE_SUPER_DEFENCE_POTION1),
	DIVINE_SUPER_STRENGTH(Type.POTION, "S.Str", "S.S", ItemID.DIVINE_SUPER_STRENGTH_POTION4, ItemID.DIVINE_SUPER_STRENGTH_POTION3, ItemID.DIVINE_SUPER_STRENGTH_POTION2, ItemID.DIVINE_SUPER_STRENGTH_POTION1),
	DIVINE_SUPER_COMBAT(Type.POTION, "S.Com", "S.C", ItemID.DIVINE_SUPER_COMBAT_POTION4, ItemID.DIVINE_SUPER_COMBAT_POTION3, ItemID.DIVINE_SUPER_COMBAT_POTION2, ItemID.DIVINE_SUPER_COMBAT_POTION1),
	DIVINE_RANGING(Type.POTION, "Range", "R", ItemID.DIVINE_RANGING_POTION4, ItemID.DIVINE_RANGING_POTION3, ItemID.DIVINE_RANGING_POTION2, ItemID.DIVINE_RANGING_POTION1),
	DIVINE_MAGIC(Type.POTION, "Magic", "M", ItemID.DIVINE_MAGIC_POTION4, ItemID.DIVINE_MAGIC_POTION3, ItemID.DIVINE_MAGIC_POTION2, ItemID.DIVINE_MAGIC_POTION1),
	DIVINE_BASTION(Type.POTION, "Bastion", "B", ItemID.DIVINE_BASTION_POTION4, ItemID.DIVINE_BASTION_POTION3, ItemID.DIVINE_BASTION_POTION2, ItemID.DIVINE_BASTION_POTION1),
	DIVINE_BATTLEMAGE(Type.POTION, "BatMage", "B.M", ItemID.DIVINE_BATTLEMAGE_POTION4, ItemID.DIVINE_BATTLEMAGE_POTION3, ItemID.DIVINE_BATTLEMAGE_POTION2, ItemID.DIVINE_BATTLEMAGE_POTION1),

	RESTORE(Type.POTION, "Restore", "Re", ItemID.RESTORE_POTION4, ItemID.RESTORE_POTION3, ItemID.RESTORE_POTION2, ItemID.RESTORE_POTION1),
	GUTHIX_BALANCE(Type.POTION, "GuthBal", "G.B.", ItemID.GUTHIX_BALANCE4, ItemID.GUTHIX_BALANCE3, ItemID.GUTHIX_BALANCE2, ItemID.GUTHIX_BALANCE1),
	SUPER_RESTORE(Type.POTION, "S.Rest", "S.Re", ItemID.SUPER_RESTORE4, ItemID.SUPER_RESTORE3, ItemID.SUPER_RESTORE2, ItemID.SUPER_RESTORE1),
	PRAYER(Type.POTION, "Prayer", "P", ItemID.PRAYER_POTION4, ItemID.PRAYER_POTION3, ItemID.PRAYER_POTION2, ItemID.PRAYER_POTION1),
	ENERGY(Type.POTION, "Energy", "En", ItemID.ENERGY_POTION4, ItemID.ENERGY_POTION3, ItemID.ENERGY_POTION2, ItemID.ENERGY_POTION1),
	SUPER_ENERGY(Type.POTION, "S.Energ", "S.En", ItemID.SUPER_ENERGY4, ItemID.SUPER_ENERGY3, ItemID.SUPER_ENERGY2, ItemID.SUPER_ENERGY1),
	STAMINA(Type.POTION, "Stamina", "St", ItemID.STAMINA_POTION4, ItemID.STAMINA_POTION3, ItemID.STAMINA_POTION2, ItemID.STAMINA_POTION1),
	OVERLOAD(Type.POTION, "Overloa", "OL", ItemID.OVERLOAD_4, ItemID.OVERLOAD_3, ItemID.OVERLOAD_2, ItemID.OVERLOAD_1),
	ABSORPTION(Type.POTION, "Absorb", "Ab", ItemID.ABSORPTION_4, ItemID.ABSORPTION_3, ItemID.ABSORPTION_2, ItemID.ABSORPTION_1),

	ZAMORAK_BREW(Type.POTION, "ZammyBr", "Za", ItemID.ZAMORAK_BREW4, ItemID.ZAMORAK_BREW3, ItemID.ZAMORAK_BREW2, ItemID.ZAMORAK_BREW1),
	SARADOMIN_BREW(Type.POTION, "SaraBr", "Sa", ItemID.SARADOMIN_BREW4, ItemID.SARADOMIN_BREW3, ItemID.SARADOMIN_BREW2, ItemID.SARADOMIN_BREW1),

	ANTIPOISON(Type.POTION, "AntiP", "AP", ItemID.ANTIPOISON4, ItemID.ANTIPOISON3, ItemID.ANTIPOISON2, ItemID.ANTIPOISON1),
	SUPERANTIPOISON(Type.POTION, "S.AntiP", "S.AP", ItemID.SUPERANTIPOISON4, ItemID.SUPERANTIPOISON3, ItemID.SUPERANTIPOISON2, ItemID.SUPERANTIPOISON1),
	ANTIDOTE_P(Type.POTION, "Antid+", "A+", ItemID.ANTIDOTE4, ItemID.ANTIDOTE3, ItemID.ANTIDOTE2, ItemID.ANTIDOTE1),
	ANTIDOTE_PP(Type.POTION, "Antid++", "A++", ItemID.ANTIDOTE4_5952, ItemID.ANTIDOTE3_5954, ItemID.ANTIDOTE2_5956, ItemID.ANTIDOTE1_5958),
	ANTIVENOM(Type.POTION, "Anti-V", "AV", ItemID.ANTIVENOM4, ItemID.ANTIVENOM3, ItemID.ANTIVENOM2, ItemID.ANTIVENOM1),
	ANTIVENOM_P(Type.POTION, "Anti-V+", "AV+", ItemID.ANTIVENOM4_12913, ItemID.ANTIVENOM3_12915, ItemID.ANTIVENOM2_12917, ItemID.ANTIVENOM1_12919),

	RELICYMS_BALM(Type.POTION, "Relicym", "R.B", ItemID.RELICYMS_BALM4, ItemID.RELICYMS_BALM3, ItemID.RELICYMS_BALM2, ItemID.RELICYMS_BALM1),
	SANFEW_SERUM(Type.POTION, "Sanfew", "Sf", ItemID.SANFEW_SERUM4, ItemID.SANFEW_SERUM3, ItemID.SANFEW_SERUM2, ItemID.SANFEW_SERUM1),
	ANTIFIRE(Type.POTION, "Antif", "Af", ItemID.ANTIFIRE_POTION4, ItemID.ANTIFIRE_POTION3, ItemID.ANTIFIRE_POTION2, ItemID.ANTIFIRE_POTION1),
	EXTENDED_ANTIFIRE(Type.POTION, "E.Antif", "E.Af", ItemID.EXTENDED_ANTIFIRE4, ItemID.EXTENDED_ANTIFIRE3, ItemID.EXTENDED_ANTIFIRE2, ItemID.EXTENDED_ANTIFIRE1),
	SUPER_ANTIFIRE(Type.POTION, "S.Antif", "S.Af", ItemID.SUPER_ANTIFIRE_POTION4, ItemID.SUPER_ANTIFIRE_POTION3, ItemID.SUPER_ANTIFIRE_POTION2, ItemID.SUPER_ANTIFIRE_POTION1),
	EXTENDED_SUPER_ANTIFIRE(Type.POTION, "ES.Antif", "ES.Af", ItemID.EXTENDED_SUPER_ANTIFIRE4, ItemID.EXTENDED_SUPER_ANTIFIRE3, ItemID.EXTENDED_SUPER_ANTIFIRE2, ItemID.EXTENDED_SUPER_ANTIFIRE1),

	SERUM_207(Type.POTION, "Ser207", "S7", ItemID.SERUM_207_4, ItemID.SERUM_207_3, ItemID.SERUM_207_2, ItemID.SERUM_207_1),
	SERUM_208(Type.POTION, "Ser208", "S8", ItemID.SERUM_208_4, ItemID.SERUM_208_3, ItemID.SERUM_208_2, ItemID.SERUM_208_1),
	COMPOST(Type.POTION, "Compost", "Cp", ItemID.COMPOST_POTION4, ItemID.COMPOST_POTION3, ItemID.COMPOST_POTION2, ItemID.COMPOST_POTION1),

	AGILITY(Type.POTION, "Agility", "Ag", ItemID.AGILITY_POTION4, ItemID.AGILITY_POTION3, ItemID.AGILITY_POTION2, ItemID.AGILITY_POTION1),
	FISHING(Type.POTION, "Fishing", "Fi", ItemID.FISHING_POTION4, ItemID.FISHING_POTION3, ItemID.FISHING_POTION2, ItemID.FISHING_POTION1),
	HUNTER(Type.POTION, "Hunter", "Hu", ItemID.HUNTER_POTION4, ItemID.HUNTER_POTION3, ItemID.HUNTER_POTION2, ItemID.HUNTER_POTION1),

	// Unfinished Potions
	GUAM_POTION(Type.POTION, "Guam", "G", ItemID.GUAM_POTION_UNF),
	MARRENTILL_POTION(Type.POTION, "Marren", "M", ItemID.MARRENTILL_POTION_UNF),
	TARROMIN_POTION(Type.POTION, "Tarro", "TAR", ItemID.TARROMIN_POTION_UNF),
	HARRALANDER_POTION(Type.POTION, "Harra", "H", ItemID.HARRALANDER_POTION_UNF),
	RANARR_POTION(Type.POTION, "Ranarr", "R", ItemID.RANARR_POTION_UNF),
	TOADFLAX_POTION(Type.POTION, "Toad", "TOA", ItemID.TOADFLAX_POTION_UNF),
	IRIT_POTION(Type.POTION, "Irit", "I", ItemID.IRIT_POTION_UNF),
	AVANTOE_POTION(Type.POTION, "Avan", "A", ItemID.AVANTOE_POTION_UNF),
	KWUARM_POTION(Type.POTION, "Kwuarm", "K", ItemID.KWUARM_POTION_UNF),
	SNAPDRAGON_POTION(Type.POTION, "Snap", "S", ItemID.SNAPDRAGON_POTION_UNF),
	CADANTINE_POTION(Type.POTION, "Cadan", "C", ItemID.CADANTINE_POTION_UNF),
	LANTADYME_POTION(Type.POTION, "Lanta", "L", ItemID.LANTADYME_POTION_UNF),
	DWARF_WEED_POTION(Type.POTION, "Dwarf", "D", ItemID.DWARF_WEED_POTION_UNF),
	TORSTOL_POTION(Type.POTION, "Torstol", "TOR", ItemID.TORSTOL_POTION_UNF),

	// Impling jars
	BABY_IMPLING(Type.IMPLING_JAR, "Baby", "B", ItemID.BABY_IMPLING_JAR),
	YOUNG_IMPLING(Type.IMPLING_JAR, "Young", "Y", ItemID.YOUNG_IMPLING_JAR),
	GOURMET_IMPLING(Type.IMPLING_JAR, "Gourmet", "G", ItemID.GOURMET_IMPLING_JAR),
	EARTH_IMPLING(Type.IMPLING_JAR, "Earth", "EAR", ItemID.EARTH_IMPLING_JAR),
	ESSENCE_IMPLING(Type.IMPLING_JAR, "Essen", "ESS", ItemID.ESSENCE_IMPLING_JAR),
	ECLECTIC_IMPLING(Type.IMPLING_JAR, "Eclect", "ECL", ItemID.ECLECTIC_IMPLING_JAR),
	NATURE_IMPLING(Type.IMPLING_JAR, "Nature", "NAT", ItemID.NATURE_IMPLING_JAR),
	MAGPIE_IMPLING(Type.IMPLING_JAR, "Magpie", "M", ItemID.MAGPIE_IMPLING_JAR),
	NINJA_IMPLING(Type.IMPLING_JAR, "Ninja", "NIN", ItemID.NINJA_IMPLING_JAR),
	CRYSTAL_IMPLING(Type.IMPLING_JAR, "Crystal", "C", ItemID.CRYSTAL_IMPLING_JAR),
	DRAGON_IMPLING(Type.IMPLING_JAR, "Dragon", "D", ItemID.DRAGON_IMPLING_JAR),
	LUCKY_IMPLING(Type.IMPLING_JAR, "Lucky", "L", ItemID.LUCKY_IMPLING_JAR),

	// Tablets
	VARROCK_TELEPORT(Type.TABLET, "Varro", "VAR", ItemID.VARROCK_TELEPORT),
	LUMBRIDGE_TELEPORT(Type.TABLET, "Lumbr", "LUM", ItemID.LUMBRIDGE_TELEPORT),
	FALADOR_TELEPORT(Type.TABLET, "Fala", "FAL", ItemID.FALADOR_TELEPORT),
	CAMELOT_TELEPORT(Type.TABLET, "Cammy", "CAM", ItemID.CAMELOT_TELEPORT),
	ARDOUGNE_TELEPORT(Type.TABLET, "Ardoug", "ARD", ItemID.ARDOUGNE_TELEPORT),
	WATCHTOWER_TELEPORT(Type.TABLET, "W.tow", "WT", ItemID.WATCHTOWER_TELEPORT),
	TELEPORT_TO_HOUSE(Type.TABLET, "House", "POH", ItemID.TELEPORT_TO_HOUSE),
	ENCHANT_SAPPHIRE_OR_OPAL(Type.TABLET, "E.Saph", "E SO", ItemID.ENCHANT_SAPPHIRE_OR_OPAL),
	ENCHANT_EMERALD_OR_JADE(Type.TABLET, "E.Emer", "E EJ", ItemID.ENCHANT_EMERALD_OR_JADE),
	ENCHANT_RUBY_OR_TOPAZ(Type.TABLET, "E.Ruby", "E RT", ItemID.ENCHANT_RUBY_OR_TOPAZ),
	ENCHANT_DIAMOND(Type.TABLET, "E.Diam", "E DIA", ItemID.ENCHANT_DIAMOND),
	ENCHANT_DRAGONSTONE(Type.TABLET, "E.Dstn", "E DS", ItemID.ENCHANT_DRAGONSTONE),
	ENCHANT_ONYX(Type.TABLET, "E.Onyx", "E ONX", ItemID.ENCHANT_ONYX),
	TELEKINETIC_GRAB(Type.TABLET, "T.grab", "T.GRB", ItemID.TELEKINETIC_GRAB),
	BONES_TO_PEACHES(Type.TABLET, "Peach", "BtP", ItemID.BONES_TO_PEACHES_8015),
	BONES_TO_BANANAS(Type.TABLET, "Banana", "BtB", ItemID.BONES_TO_BANANAS),
	RIMMINGTON_TELEPORT(Type.TABLET, "Rimmi", "RIM", ItemID.RIMMINGTON_TELEPORT),
	TAVERLEY_TELEPORT(Type.TABLET, "Taver", "TAV", ItemID.TAVERLEY_TELEPORT),
	POLLNIVNEACH_TELEPORT(Type.TABLET, "Pollnv", "POL", ItemID.POLLNIVNEACH_TELEPORT),
	RELLEKKA_TELEPORT(Type.TABLET, "Rell", "REL", ItemID.RELLEKKA_TELEPORT),
	BRIMHAVEN_TELEPORT(Type.TABLET, "Brimh", "BRIM", ItemID.BRIMHAVEN_TELEPORT),
	YANILLE_TELEPORT(Type.TABLET, "Yanille", "YAN", ItemID.YANILLE_TELEPORT),
	TROLLHEIM_TELEPORT(Type.TABLET, "Trollh", "T.HM", ItemID.TROLLHEIM_TELEPORT),
	PRIFDDINAS_TELEPORT(Type.TABLET, "Prifd", "PRIF", ItemID.PRIFDDINAS_TELEPORT),
	HOSIDIUS_TELEPORT(Type.TABLET, "Hosid", "HOS", ItemID.HOSIDIUS_TELEPORT),
	ANNAKARL_TELEPORT(Type.TABLET, "Annak", "GDZ", ItemID.ANNAKARL_TELEPORT),
	CARRALLANGAR_TELEPORT(Type.TABLET, "Carra", "CAR", ItemID.CARRALLANGAR_TELEPORT),
	DAREEYAK_TELEPORT(Type.TABLET, "Dareey", "DAR", ItemID.DAREEYAK_TELEPORT),
	KHARYRLL_TELEPORT(Type.TABLET, "Khary", "KHRL", ItemID.KHARYRLL_TELEPORT),
	LASSAR_TELEPORT(Type.TABLET, "Lass", "LSR", ItemID.LASSAR_TELEPORT),
	PADDEWWA_TELEPORT(Type.TABLET, "Paddew", "PDW", ItemID.PADDEWWA_TELEPORT),
	SENNTISTEN_TELEPORT(Type.TABLET, "Sennt", "SNT", ItemID.SENNTISTEN_TELEPORT),
	LUMBRIDGE_GRAVEYARD_TELEPORT(Type.TABLET, "L.Grave", "L.GRV", ItemID.LUMBRIDGE_GRAVEYARD_TELEPORT),
	DRAYNOR_MANOR_TELEPORT(Type.TABLET, "D.Manor", "D.MNR", ItemID.DRAYNOR_MANOR_TELEPORT),
	MIND_ALTAR_TELEPORT(Type.TABLET, "M.Altar", "M.ALT", ItemID.MIND_ALTAR_TELEPORT),
	SALVE_GRAVEYARD_TELEPORT(Type.TABLET, "S.Grave", "S.GRV", ItemID.SALVE_GRAVEYARD_TELEPORT),
	FENKENSTRAINS_CASTLE_TELEPORT(Type.TABLET, "Fenk", "FNK", ItemID.FENKENSTRAINS_CASTLE_TELEPORT),
	WEST_ARDOUGNE_TELEPORT(Type.TABLET, "W.Ardy", "W.ARD", ItemID.WEST_ARDOUGNE_TELEPORT),
	HARMONY_ISLAND_TELEPORT(Type.TABLET, "H.Isle", "HRM", ItemID.HARMONY_ISLAND_TELEPORT),
	CEMETERY_TELEPORT(Type.TABLET, "Cemet", "CEM", ItemID.CEMETERY_TELEPORT),
	BARROWS_TELEPORT(Type.TABLET, "Barrow", "BAR", ItemID.BARROWS_TELEPORT),
	APE_ATOLL_TELEPORT(Type.TABLET, "Atoll", "APE", ItemID.APE_ATOLL_TELEPORT),
	BATTLEFRONT_TELEPORT(Type.TABLET, "B.Front", "BF", ItemID.BATTLEFRONT_TELEPORT),
	TARGET_TELEPORT(Type.TABLET, "Target", "TRG", ItemID.TARGET_TELEPORT),
	VOLCANIC_MINE_TELEPORT(Type.TABLET, "V.Mine", "VM", ItemID.VOLCANIC_MINE_TELEPORT),
	WILDERNESS_CRABS_TELEPORT(Type.TABLET, "W.Crab", "CRAB", ItemID.WILDERNESS_CRABS_TELEPORT);

	final Type type;
	final String medName;
	final String shortName;
	final int[] itemIDs;

	ItemIdentification(Type type, String medName, String shortName, int... ids)
	{
		this.type = type;
		this.medName = medName;
		this.shortName = shortName;
		this.itemIDs = ids;
	}

	private static final Map<Integer, ItemIdentification> itemIdentifications;

	static
	{
		ImmutableMap.Builder<Integer, ItemIdentification> builder = new ImmutableMap.Builder<>();

		for (ItemIdentification i : values())
		{
			for (int id : i.itemIDs)
			{
				builder.put(id, i);
			}
		}

		itemIdentifications = builder.build();
	}

	static ItemIdentification get(int id)
	{
		return itemIdentifications.get(id);
	}

	enum Type
	{
		SEED,
		HERB,
		SAPLING,
		ORE,
		GEM,
		POTION,
		IMPLING_JAR,
		TABLET
	}
}
