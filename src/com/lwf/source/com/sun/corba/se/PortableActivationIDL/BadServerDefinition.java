package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/BadServerDefinition.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u121/8372/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, December 12, 2016 8:41:11 PM PST
*/

public final class BadServerDefinition extends org.omg.CORBA.UserException
{
  public String reason = null;

  public BadServerDefinition ()
  {
    super(BadServerDefinitionHelper.id());
  } // ctor

  public BadServerDefinition (String _reason)
  {
    super(BadServerDefinitionHelper.id());
    reason = _reason;
  } // ctor


  public BadServerDefinition (String $reason, String _reason)
  {
    super(BadServerDefinitionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class BadServerDefinition
