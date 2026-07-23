package org.canard.canard;

import org.canard.cancan.CancanStandard;
import org.canard.vol.PeutVoler;

public class Canard extends AbstractCanard{
    public Canard() {
        super(new CancanStandard(), new PeutVoler());
    }
}
