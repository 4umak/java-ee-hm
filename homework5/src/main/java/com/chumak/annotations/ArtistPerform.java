package com.chumak.annotations;

public class ArtistPerform implements IPerformer {
    public void perform() throws Exception {
        System.out.println("Artist performed!");
        throw new Exception();
    }
}
