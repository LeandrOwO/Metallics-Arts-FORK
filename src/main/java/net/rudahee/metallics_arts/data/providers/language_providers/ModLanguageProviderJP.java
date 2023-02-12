package net.rudahee.metallics_arts.data.providers.language_providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.rudahee.metallics_arts.data.enums.implementations.languages.*;

import java.util.HashMap;
import java.util.Map;

public class ModLanguageProviderJP extends LanguageProvider {

    private Map<String, String> base = new HashMap<>() {{
        put("item.metallics_arts.large_vial", CTW.VIAL.getNameInJapanese() + " " + CTW.LARGE.getNameInJapanese());
        put("item.metallics_arts.small_vial", CTW.VIAL.getNameInJapanese() + " " + CTW.SMALL.getNameInJapanese());
        put("curios.identifier.metalmind_slot", CTW.SLOT.getNameInJapanese() + " " + CTW.METALMIND);

        put("itemGroup.metallics_arts", CTW.METALLICS_ARTS.getNameInJapanese());
        put("itemGroup.metallics_arts.decorations", CTW.METALLICS_ARTS.getNameInJapanese() + " " + CTW.DECORATIONS.getNameInJapanese());

        put("key.category_powers_metallics_arts", CTW.METALLICS_ARTS.getNameInJapanese() + ": " + CTW.POWERS.getNameInJapanese());
        put("key.categorymetallics_arts", CTW.METALLICS_ARTS.getNameInJapanese());
        put("key.metallics_arts.allomantic", CTW.POWER_SELECTOR.getNameInJapanese() + " " + CTW.ALLOMANTIC.getNameInJapanese());
        put("key.metallics_arts.feruchemic", CTW.POWER_SELECTOR.getNameInJapanese() + " " + CTW.FERUCHEMICAL.getNameInJapanese());
        put("key.metallics_arts.allomantic_push", CTW.PUSH.getNameInJapanese()+ " " + CTW.ALLOMANTIC.getNameInJapanese());
        put("key.metallics_arts.allomantic_pull", CTW.PULL.getNameInJapanese()+ " " + CTW.ALLOMANTIC.getNameInJapanese());
        put("key.metallics_arts.vertical_jump", CTW.PUSH.getNameInJapanese()+ " " + CTW.VERTICAL.getNameInJapanese());
        put("key.metallics_arts.feruchemic_decant", CTW.TAPPING.getNameInJapanese()+ " " + CTW.FERUCHEMICAL.getNameInJapanese());
        put("key.metallics_arts.feruchemic_store", CTW.STORAGE.getNameInJapanese()+ " " + CTW.FERUCHEMICAL.getNameInJapanese());
        put("key.metallics_arts.switch_overlay", CTW.SWITCH_OVERLAY.getNameInJapanese());

        put("metallics_arts.patchouli.name_book", CTW.METALLICS_ARTS.getNameInJapanese() + ": " + CTW.GUIDE.getNameInJapanese());

        put("metallics_arts.mental_mind_translate.has_reserve", CTW.HAS_RESERVE.getNameInJapanese());
        put("metallics_arts.mental_mind_translate.not_has_reserve", CTW.NOT_HAS_RESERVE.getNameInJapanese());
        put("metallics_arts.spike_feruchemic_power", CTW.STORAGE_POWER.getNameInJapanese() + ": " + CTW.FERUCHEMICAL.getNameInJapanese());
        put("metallics_arts.spike_allomantic_power", CTW.STORAGE_POWER.getNameInJapanese() + ": " + CTW.ALLOMANTIC.getNameInJapanese());

        //ver porque usa "spike"
        put("metallics_arts.spike_allomantic_power.tapping_identity", CTW.TAPPING.getNameInJapanese());

        //arreglar estos de aca abajo
        put("metallics_arts.mental_mind_translate.store_identity", CTW.STORE_IDENTITY.getNameInJapanese());
        put("metallics_arts.mental_mind_translate.off_power", CTW.POWER_OFF.getNameInJapanese());
        put("metallics_arts.mental_mind.owner", CTW.OWNER.getNameInJapanese());
        put("metallics_arts.mental_mind.nobody", CTW.NOBODY.getNameInJapanese());
        put("metallics_arts.mental_mind.owner_someone", CTW.OWNER_SOMEONE.getNameInJapanese());
        put("metallics_arts.mental_mind_translate.uses", CTW.USES.getNameInJapanese());


        put("metallics_arts.patchouli.landing_text", "Soy, por desgracia, el Héroe de las Eras, y tengo una pregunta que hacerte, ¿acaso un hombre no tiene derecho a poseer sus propios metales? No, dice el hombre del Imperio. Pertenece al \"dios\". No, dice el superviviente. Pertenece a todos. No, dice el hombre de Elendel. Pertenece a los pobres. Yo rechacé esas propuestas. En vez de eso elegí algo distinto. Elegi mi propio camino, elegí... Artes Metalicas Mod.");
        put("item.metallics_arts.obsidian_dagger", CTW.OBSIDIAN_DAGGER.getNameInJapanese());
        put("item.metallics_arts.cristal_dagger", CTW.CRISTAL_DAGGER.getNameInJapanese());
        put("item.metallics_arts.koloss_blade", CTW.KOLOSS_BLADE.getNameInJapanese());
        put("item.metallics_arts.dueling_staff", CTW.DUELING_STAFF.getNameInJapanese());
        put("item.metallics_arts.obsidian_axe", CTW.OBSIDIAN_AXE.getNameInJapanese());

    }};


    private Map<String, String> ingots = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {

            if (!metal.isVanilla()) {
                put("item.metallics_arts." + metal.getId() + "_ingot", CTW.INGOT.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }

        }
    }};
    private Map<String, String> rawItems = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla()) {
                put("item.metallics_arts.raw_" + metal.getId(), MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.RAW.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> gems = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (metal.isDivine()) {
                put("item.metallics_arts." + metal.getId(), CTW.GEM.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
        }
    }};
    private Map<String, String> nuggets = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla()) {
                put("item.metallics_arts."+ metal.getId()+"_nugget", CTW.NUGGET.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
            if (metal.isDivine()) {
                put("item.metallics_arts." + metal.getId() + "_nugget", CTW.NUGGET.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
        }
        put("item.metallics_arts.copper_nugget", CTW.NUGGET.getNameInJapanese() + " " + MetalNamesEnum.COPPER.getNameInLowerSpanish());
    }};
    private Map<String, String> blocks = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla()) {
                put("block.metallics_arts." + metal.getId() + "_block",
                        CTW.BLOCK.getNameInJapanese()+ " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
            if (metal.isDivine()) {
                put("block.metallics_arts." + metal.getId() + "_block", CTW.BLOCK.getNameInJapanese()+ " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
        }
    }};
    private Map<String, String> rawBlocks = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla()) {
                put("block.metallics_arts.raw_"+metal.getId()+"_block", CTW.BLOCK.getNameInJapanese()+ " " +
                        MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish() + " " + CTW.RAW.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> ores = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla() && !metal.isAlloy() && metal.isAppearsInStone()) {
                    put("block.metallics_arts." + metal.getId()+"_ore", CTW.ORE.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());

            }
        }

    }};
    private Map<String, String> deepslateOres = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isVanilla() && !metal.isAlloy() && metal.isAppearsInDeepslate()) {
                    put("block.metallics_arts.deepslate_" + metal.getId()+"_ore", CTW.ORE.getNameInJapanese() + " " +
                            MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish() + " " + CTW.DEEPSLATE.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> geodeBlocks = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (metal.isDivine() && !metal.isAlloy()) {
                put("block.metallics_arts." + metal.getId() + "_cristal_block", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.CRISTAL.getNameInJapanese());
                put("block.metallics_arts.budding_" + metal.getId(), CTW.BUDDING.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
                put("block.metallics_arts." + metal.getId() + "_cluster", CTW.CLUSTER.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
                put("block.metallics_arts.small_" + metal.getId() + "_bud", CTW.BUD.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish() + " " +
                        CTW.SMALL.getNameInJapanese());
                put("block.metallics_arts.medium_" + metal.getId() + "_bud", CTW.BUD.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish() + " " +
                        CTW.MEDIUM.getNameInJapanese());
                put("block.metallics_arts.large_" + metal.getId() + "_bud", CTW.BUD.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish() + " " +
                        CTW.LARGE.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> spikes = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("item.metallics_arts."+ metal.getId() +"_spike", CTW.SPIKE.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
        }
    }};
    private Map<String, String> metalMinds = new HashMap<>() {{
        for (MetalMinds metalMind : MetalMinds.values()) {
            put("item.metallics_arts.band_" + metalMind.getId(), CTW.BAND.getNameInJapanese() + " " + metalMind.getNameInEnglish());
            put("item.metallics_arts.ring_" + metalMind.getId(), CTW.RING.getNameInJapanese() + " " + metalMind.getNameInEnglish());
        }
    }};
    private Map<String, String> icons = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("item.metallics_arts."+ metal.getId()+"_allomantic_icon" , MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.ALLOMANTIC.getNameInJapanese());
                put("item.metallics_arts."+ metal.getId()+"_feruchemic_icon" , MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.FERUCHEMICAL.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> metals = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("metallics_arts.metal_translate."+ metal.getId() , MetalNamesEnum.valueOf(metal.name()).getNameInJapanese());
            }
        }
    }};
    private Map<String, String> powers = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("key.metallics_arts."+ metal.getId() +"_power", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese());
            }
        }
    }};
    private Map<String, String> symbols = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("f_"+metal.getId()+"_1", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.FERUCHEMICAL_SHADING.getNameInJapanese());
                put("f_"+metal.getId()+"_2", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.FERUCHEMICAL_SOLID.getNameInJapanese());
                put("a_"+metal.getId()+"_1", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.ALLOMANTIC_SHADING.getNameInJapanese());
                put("a_"+metal.getId()+"_2", MetalNamesEnum.valueOf(metal.name()).getNameInJapanese() + " " + CTW.ALLOMANTIC_SOLID.getNameInJapanese());
            }
        }
    }};
    private Map<String, String> patterns = new HashMap<>() {{
        for (MetalAuxiliaryInfo metal: MetalAuxiliaryInfo.values()) {
            if (!metal.isOnlyForAlloys()) {
                put("item.metallics_arts.f_"+metal.getId()+"_pattern", CTW.FERUCHEMICAL_PATTERN.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
                put("item.metallics_arts.f_"+metal.getId()+"_pattern.desc", CTW.FERUCHEMICAL_PATTERN.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
                put("item.metallics_arts.a_"+metal.getId()+"_pattern", CTW.ALLOMANTIC_PATTERN.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
                put("item.metallics_arts.a_"+metal.getId()+"_pattern.desc", CTW.ALLOMANTIC_PATTERN.getNameInJapanese() + " " + MetalNamesEnum.valueOf(metal.name()).getNameInLowerSpanish());
            }
        }

    }};
    private Map<String, String> colors = new HashMap<>() {{
        for (ColorsNames color : ColorsNames.values()) {
            put(color.getId(),color.getNameInSpanish());
        }
    }};

    public ModLanguageProviderJP(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {

        for (String key: ingots.keySet()){
            add(key, ingots.get(key));
        }

        for (String key: gems.keySet()){
            add(key, gems.get(key));
        }

        for (String key: rawBlocks.keySet()){
            add(key, rawBlocks.get(key));
        }

        for (String key: metalMinds.keySet()){
            add(key, metalMinds.get(key));
        }

        for (String key: rawItems.keySet()){
            add(key, rawItems.get(key));
        }

        for (String key: geodeBlocks.keySet()){
            add(key, geodeBlocks.get(key));
        }

        for (String key: ores.keySet()){
            add(key, ores.get(key));
        }
        for (String key: deepslateOres.keySet()){
            add(key, deepslateOres.get(key));
        }

        for (String key: nuggets.keySet()){
            add(key, nuggets.get(key));
        }

        for (String key: blocks.keySet()){
            add(key, blocks.get(key));
        }

        for (String key: spikes.keySet()){
            add(key, spikes.get(key));
        }

        for (String key: icons.keySet()){
            add(key, icons.get(key));
        }

        for (String key: metals.keySet()){
            add(key, metals.get(key));
        }

        for (String key: powers.keySet()){
            add(key, powers.get(key));
        }

        for(String key: base.keySet()) {
            add(key, base.get(key));
        }

        for(String key: patterns.keySet()){
            add(key, patterns.get(key));
        }

        for (String keySymbol : symbols.keySet()) {
            for (String keyColor : colors.keySet()) {
                add("block.minecraft.banner.metallics_arts." + keySymbol + "." + keyColor, symbols.get(keySymbol) + " " + colors.get(keyColor));
            }
        }
    }
}