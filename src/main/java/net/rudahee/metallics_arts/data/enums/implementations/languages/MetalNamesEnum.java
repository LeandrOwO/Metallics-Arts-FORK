package net.rudahee.metallics_arts.data.enums.implementations.languages;


import net.rudahee.metallics_arts.data.enums.interfaces.ILanguage;

public enum MetalNamesEnum implements ILanguage {
    IRON("iron","Iron", "Hierro",""),
    STEEL("steel","Steel", "Acero","スティール"),
    TIN("tin", "Tin", "Estaño",""),
    PEWTER("pewter","Pewter", "Peltre",""),
    ZINC("zinc","Zinc", "Zinc",""),
    BRASS("brass","Brass", "Laton",""),
    COPPER("copper","Copper", "Cobre",""),
    BRONZE("bronze","Bronze", "Bronce",""),
    ALUMINUM("aluminum","Aluminum", "Aluminio",""),
    DURALUMIN("duralumin","Duralumin", "Duralumin",""),
    CHROMIUM("chromium", "Chromium", "Cromo",""),
    NICROSIL("nicrosil","Nicrosil", "Nicrosil",""),
    GOLD("gold", "Gold", "Oro",""),
    ELECTRUM("electrum", "Electrum", "Electrum",""),
    CADMIUM("cadmium", "Cadmium", "Cadmio",""),
    BENDALLOY("bendalloy","Bendalloy", "Bendaleo",""),
    ATIUM("atium", "Atium", "Atium",""),
    MALATIUM("malatium", "Malatium", "Malatium",""),
    LERASIUM("lerasium", "Lerasium", "Lerasium",""),
    ETTMETAL("ettmetal", "Ettmetal", "Ettmetal",""),
    SILVER( "silver", "Silver", "Plata",""),
    LEAD("lead", "Lead", "Plomo",""),
    NICKEL("nickel", "Nickel", "Níquel","");
    private final String id;
    private final String english;
    private final String spanish;
    private final String japanese;

    MetalNamesEnum(String id, String english, String spanish, String japanese) {
        this.id = id;
        this.english = english;
        this.spanish = spanish;
        this.japanese = japanese;
    }

    public String getId() {
        return this.id;
    }
    @Override
    public String getNameInSpanish() {
        return this.spanish;
    }
    @Override
    public String getNameInEnglish() {
        return this.english;
    }

    public String getNameInLowerSpanish() {
        return this.spanish.toLowerCase();
    }
    public String getNameInLowerEnglish() {
        return this.english.toLowerCase();
    }

    public String getNameInJapanese() {
        return this.japanese;
    }
}
