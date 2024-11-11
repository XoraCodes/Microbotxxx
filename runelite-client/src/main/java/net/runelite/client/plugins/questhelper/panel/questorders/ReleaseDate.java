/*
 * Copyright (c) 2024, pajlada <https://github.com/pajlada>
 * Copyright (c) 2021, Zoinkwiz
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
package net.runelite.client.plugins.questhelper.panel.questorders;

import com.google.common.collect.ImmutableList;
import lombok.Getter;
import net.runelite.client.plugins.questhelper.questinfo.QuestHelperQuest;

import java.util.List;

/**
 * The order of these quests are parsed using data from the <a href="https://oldschool.runescape.wiki/w/Quests/List">OSRS Wiki</a>
 */
public class ReleaseDate {
    @Getter
    private static final List<QuestHelperQuest> questList = ImmutableList.of(
            // Quests
            QuestHelperQuest.COOKS_ASSISTANT,
            QuestHelperQuest.DEMON_SLAYER,
            QuestHelperQuest.THE_RESTLESS_GHOST,
            QuestHelperQuest.ROMEO__JULIET,
            QuestHelperQuest.SHEEP_SHEARER,
            QuestHelperQuest.SHIELD_OF_ARRAV_BLACK_ARM_GANG,
            QuestHelperQuest.SHIELD_OF_ARRAV_PHOENIX_GANG,
            QuestHelperQuest.ERNEST_THE_CHICKEN,
            QuestHelperQuest.VAMPYRE_SLAYER,
            QuestHelperQuest.IMP_CATCHER,
            QuestHelperQuest.PRINCE_ALI_RESCUE,
            QuestHelperQuest.DORICS_QUEST,
            QuestHelperQuest.BLACK_KNIGHTS_FORTRESS,
            QuestHelperQuest.WITCHS_POTION,
            QuestHelperQuest.THE_KNIGHTS_SWORD,
            QuestHelperQuest.GOBLIN_DIPLOMACY,
            QuestHelperQuest.PIRATES_TREASURE,
            QuestHelperQuest.DRAGON_SLAYER_I,
            QuestHelperQuest.DRUIDIC_RITUAL,
            QuestHelperQuest.LOST_CITY,
            QuestHelperQuest.WITCHS_HOUSE,
            QuestHelperQuest.MERLINS_CRYSTAL,
            QuestHelperQuest.HEROES_QUEST,
            QuestHelperQuest.SCORPION_CATCHER,
            QuestHelperQuest.FAMILY_CREST,
            QuestHelperQuest.TRIBAL_TOTEM,
            QuestHelperQuest.FISHING_CONTEST,
            QuestHelperQuest.MONKS_FRIEND,
            QuestHelperQuest.TEMPLE_OF_IKOV,
            QuestHelperQuest.CLOCK_TOWER,
            QuestHelperQuest.HOLY_GRAIL,
            QuestHelperQuest.TREE_GNOME_VILLAGE,
            QuestHelperQuest.FIGHT_ARENA,
            QuestHelperQuest.HAZEEL_CULT,
            QuestHelperQuest.SHEEP_HERDER,
            QuestHelperQuest.PLAGUE_CITY,
            QuestHelperQuest.SEA_SLUG,
            QuestHelperQuest.WATERFALL_QUEST,
            QuestHelperQuest.BIOHAZARD,
            QuestHelperQuest.JUNGLE_POTION,
            QuestHelperQuest.THE_GRAND_TREE,
            QuestHelperQuest.SHILO_VILLAGE,
            QuestHelperQuest.UNDERGROUND_PASS,
            QuestHelperQuest.OBSERVATORY_QUEST,
            QuestHelperQuest.THE_TOURIST_TRAP,
            QuestHelperQuest.WATCHTOWER,
            QuestHelperQuest.DWARF_CANNON,
            QuestHelperQuest.MURDER_MYSTERY,
            QuestHelperQuest.THE_DIG_SITE,
            QuestHelperQuest.GERTRUDES_CAT,
            QuestHelperQuest.LEGENDS_QUEST,
            QuestHelperQuest.RUNE_MYSTERIES,
            QuestHelperQuest.BIG_CHOMPY_BIRD_HUNTING,
            QuestHelperQuest.ELEMENTAL_WORKSHOP_I,
            QuestHelperQuest.PRIEST_IN_PERIL,
            QuestHelperQuest.NATURE_SPIRIT,
            QuestHelperQuest.DEATH_PLATEAU,
            QuestHelperQuest.TROLL_STRONGHOLD,
            QuestHelperQuest.TAI_BWO_WANNAI_TRIO,
            QuestHelperQuest.REGICIDE,
            QuestHelperQuest.EADGARS_RUSE,
            QuestHelperQuest.SHADES_OF_MORTTON,
            QuestHelperQuest.THE_FREMENNIK_TRIALS,
            QuestHelperQuest.HORROR_FROM_THE_DEEP,
            QuestHelperQuest.THRONE_OF_MISCELLANIA,
            QuestHelperQuest.MONKEY_MADNESS_I,
            QuestHelperQuest.HAUNTED_MINE,
            QuestHelperQuest.TROLL_ROMANCE,
            QuestHelperQuest.IN_SEARCH_OF_THE_MYREQUE,
            QuestHelperQuest.CREATURE_OF_FENKENSTRAIN,
            QuestHelperQuest.ROVING_ELVES,
            QuestHelperQuest.GHOSTS_AHOY,
            QuestHelperQuest.ONE_SMALL_FAVOUR,
            QuestHelperQuest.MOUNTAIN_DAUGHTER,
            QuestHelperQuest.BETWEEN_A_ROCK,
            QuestHelperQuest.THE_FEUD,
            QuestHelperQuest.THE_GOLEM,
            QuestHelperQuest.DESERT_TREASURE,
            QuestHelperQuest.ICTHLARINS_LITTLE_HELPER,
            QuestHelperQuest.TEARS_OF_GUTHIX,
            QuestHelperQuest.ZOGRE_FLESH_EATERS,
            QuestHelperQuest.THE_LOST_TRIBE,
            QuestHelperQuest.THE_GIANT_DWARF,
            QuestHelperQuest.RECRUITMENT_DRIVE,
            QuestHelperQuest.MOURNINGS_END_PART_I,
            QuestHelperQuest.FORGETTABLE_TALE,
            QuestHelperQuest.GARDEN_OF_TRANQUILLITY,
            QuestHelperQuest.A_TAIL_OF_TWO_CATS,
            QuestHelperQuest.WANTED,
            QuestHelperQuest.MOURNINGS_END_PART_II,
            QuestHelperQuest.RUM_DEAL,
            QuestHelperQuest.SHADOW_OF_THE_STORM,
            QuestHelperQuest.MAKING_HISTORY,
            QuestHelperQuest.RATCATCHERS,
            QuestHelperQuest.SPIRITS_OF_THE_ELID,
            QuestHelperQuest.DEVIOUS_MINDS,
            QuestHelperQuest.THE_HAND_IN_THE_SAND,
            QuestHelperQuest.ENAKHRAS_LAMENT,
            QuestHelperQuest.CABIN_FEVER,
            QuestHelperQuest.FAIRYTALE_I__GROWING_PAINS,
            QuestHelperQuest.RECIPE_FOR_DISASTER_START,
            QuestHelperQuest.RECIPE_FOR_DISASTER_DWARF,
            QuestHelperQuest.RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_PIRATE_PETE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_EVIL_DAVE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR,
            QuestHelperQuest.RECIPE_FOR_DISASTER_SIR_AMIK_VARZE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE,
            QuestHelperQuest.RECIPE_FOR_DISASTER_FINALE,
            QuestHelperQuest.IN_AID_OF_THE_MYREQUE,
            QuestHelperQuest.A_SOULS_BANE,
            QuestHelperQuest.RAG_AND_BONE_MAN_I,
            QuestHelperQuest.RAG_AND_BONE_MAN_II,
            QuestHelperQuest.SWAN_SONG,
            QuestHelperQuest.ROYAL_TROUBLE,
            QuestHelperQuest.DEATH_TO_THE_DORGESHUUN,
            QuestHelperQuest.FAIRYTALE_II__CURE_A_QUEEN,
            QuestHelperQuest.LUNAR_DIPLOMACY,
            QuestHelperQuest.THE_EYES_OF_GLOUPHRIE,
            QuestHelperQuest.DARKNESS_OF_HALLOWVALE,
            QuestHelperQuest.THE_SLUG_MENACE,
            QuestHelperQuest.ELEMENTAL_WORKSHOP_II,
            QuestHelperQuest.MY_ARMS_BIG_ADVENTURE,
            QuestHelperQuest.ENLIGHTENED_JOURNEY,
            QuestHelperQuest.EAGLES_PEAK,
            QuestHelperQuest.ANIMAL_MAGNETISM,
            QuestHelperQuest.CONTACT,
            QuestHelperQuest.COLD_WAR,
            QuestHelperQuest.THE_FREMENNIK_ISLES,
            QuestHelperQuest.TOWER_OF_LIFE,
            QuestHelperQuest.THE_GREAT_BRAIN_ROBBERY,
            QuestHelperQuest.WHAT_LIES_BELOW,
            QuestHelperQuest.OLAFS_QUEST,
            QuestHelperQuest.ANOTHER_SLICE_OF_HAM,
            QuestHelperQuest.DREAM_MENTOR,
            QuestHelperQuest.GRIM_TALES,
            QuestHelperQuest.KINGS_RANSOM,
            QuestHelperQuest.MONKEY_MADNESS_II,
            QuestHelperQuest.MISTHALIN_MYSTERY,
            QuestHelperQuest.CLIENT_OF_KOUREND,
            QuestHelperQuest.BONE_VOYAGE,
            QuestHelperQuest.THE_QUEEN_OF_THIEVES,
            QuestHelperQuest.THE_DEPTHS_OF_DESPAIR,
            QuestHelperQuest.THE_CORSAIR_CURSE,
            QuestHelperQuest.DRAGON_SLAYER_II,
            QuestHelperQuest.TALE_OF_THE_RIGHTEOUS,
            QuestHelperQuest.A_TASTE_OF_HOPE,
            QuestHelperQuest.MAKING_FRIENDS_WITH_MY_ARM,
            QuestHelperQuest.THE_FORSAKEN_TOWER,
            QuestHelperQuest.THE_ASCENT_OF_ARCEUUS,
            QuestHelperQuest.X_MARKS_THE_SPOT,
            QuestHelperQuest.SONG_OF_THE_ELVES,
            QuestHelperQuest.THE_FREMENNIK_EXILES,
            QuestHelperQuest.SINS_OF_THE_FATHER,
            QuestHelperQuest.A_PORCINE_OF_INTEREST,
            QuestHelperQuest.GETTING_AHEAD,
            QuestHelperQuest.BELOW_ICE_MOUNTAIN,
            QuestHelperQuest.A_NIGHT_AT_THE_THEATRE,
            QuestHelperQuest.A_KINGDOM_DIVIDED,
            QuestHelperQuest.LAND_OF_THE_GOBLINS,
            QuestHelperQuest.TEMPLE_OF_THE_EYE,
            QuestHelperQuest.BENEATH_CURSED_SANDS,
            QuestHelperQuest.SLEEPING_GIANTS,
            QuestHelperQuest.THE_GARDEN_OF_DEATH,
            QuestHelperQuest.SECRETS_OF_THE_NORTH,
            QuestHelperQuest.DESERT_TREASURE_II,
            QuestHelperQuest.THE_PATH_OF_GLOUPHRIE,
            QuestHelperQuest.CHILDREN_OF_THE_SUN,
            QuestHelperQuest.DEFENDER_OF_VARROCK,
            QuestHelperQuest.TWILIGHTS_PROMISE,
            QuestHelperQuest.AT_FIRST_LIGHT,
            QuestHelperQuest.PERILOUS_MOON,
            QuestHelperQuest.THE_RIBBITING_TALE_OF_A_LILY_PAD_LABOUR_DISPUTE,
            QuestHelperQuest.WHILE_GUTHIX_SLEEPS,
            QuestHelperQuest.THE_HEART_OF_DARKNESS,
            QuestHelperQuest.DEATH_ON_THE_ISLE,
            QuestHelperQuest.MEAT_AND_GREET,
            QuestHelperQuest.ETHICALLY_ACQUIRED_ANTIQUITIES,
            // Miniquests
            QuestHelperQuest.ALFRED_GRIMHANDS_BARCRAWL,
            QuestHelperQuest.THE_MAGE_ARENA,
            QuestHelperQuest.ENTER_THE_ABYSS,
            QuestHelperQuest.CURSE_OF_THE_EMPTY_LORD,
            QuestHelperQuest.SKIPPY_AND_THE_MOGRES,
            QuestHelperQuest.ENCHANTED_KEY,
            QuestHelperQuest.LAIR_OF_TARN_RAZORLOR,
            QuestHelperQuest.THE_GENERALS_SHADOW,
            QuestHelperQuest.BARBARIAN_TRAINING,
            QuestHelperQuest.BEAR_YOUR_SOUL,
            QuestHelperQuest.FAMILY_PEST,
            QuestHelperQuest.THE_MAGE_ARENA_II,
            QuestHelperQuest.IN_SEARCH_OF_KNOWLEDGE,
            QuestHelperQuest.DADDYS_HOME,
            //QuestHelperQuest.THE_FROZEN_DOOR, - Placeholder for future addition.
            QuestHelperQuest.HOPESPEARS_WILL,
            //QuestHelperQuest.INTO_THE_TOMBS, - Placeholder for future addition.
            QuestHelperQuest.HIS_FAITHFUL_SERVANTS
    );
}
