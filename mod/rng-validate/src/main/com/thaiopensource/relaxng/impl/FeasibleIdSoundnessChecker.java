package com.thaiopensource.relaxng.impl;

import org.xml.sax.ErrorHandler;

public class FeasibleIdSoundnessChecker extends IdSoundnessChecker {
  public FeasibleIdSoundnessChecker(IdTypeMap idTypeMap, ErrorHandler eh) {
    super(idTypeMap, eh);
  }

  public void endDocument() {
    setComplete();
  }
}
