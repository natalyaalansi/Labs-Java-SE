package Factoryhome;

public class PerfumeFactory {
    public Perfume
    producePerfume(int milliliters, String type){
        if(type=="Patchouli") return new PatchouliPerfume (milliliters);
        if(type=="Lavender") return new LavenderPerfume (milliliters);
        if(type=="Sandal") return new SandalPerfume(milliliters);
        else return null;

    }
}
