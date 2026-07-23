package org.canard.canard;

import org.canard.cancan.CancanSpecial;
import org.canard.vol.NePeutPasVoler;

public class CanardPlastique extends AbstractCanard {
    public CanardPlastique() {
        super(new CancanSpecial(), new NePeutPasVoler());
    }
}
