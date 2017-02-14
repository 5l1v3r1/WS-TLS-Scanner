/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rub.nds.tlsscanner.flaw;

/**
 *
 * @author Robert Merget - robert.merget@rub.de
 */
public class ConfigurationFlaw {
    private String flawName;
    private FlawLevel flawLevel;
    private String flawDescription;
    private String howToFix;

    public ConfigurationFlaw(String flawName, FlawLevel flawLevel, String flawDescription, String howToFix) {
        this.flawName = flawName;
        this.flawLevel = flawLevel;
        this.flawDescription = flawDescription;
        this.howToFix = howToFix;
    }

    public String getFlawName() {
        return flawName;
    }

    public void setFlawName(String flawName) {
        this.flawName = flawName;
    }

    public FlawLevel getFlawLevel() {
        return flawLevel;
    }

    public void setFlawLevel(FlawLevel flawLevel) {
        this.flawLevel = flawLevel;
    }

    public String getFlawDescription() {
        return flawDescription;
    }

    public void setFlawDescription(String flawDescription) {
        this.flawDescription = flawDescription;
    }

    public String getHowToFix() {
        return howToFix;
    }

    public void setHowToFix(String howToFix) {
        this.howToFix = howToFix;
    }

}
