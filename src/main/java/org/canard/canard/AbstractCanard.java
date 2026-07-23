package org.canard.canard;

import lombok.RequiredArgsConstructor;
import org.canard.cancan.Cancaner;
import org.canard.vol.Vol;

@RequiredArgsConstructor
public abstract class AbstractCanard {
    private final Cancaner cancan;
    private final Vol vol;

    public void voler(){
        vol.voler();
    }

    public void cancaner(){
        cancan.cancaner();
    }

}
