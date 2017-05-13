/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class ContainerNode {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ContainerNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContainerNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_ContainerNode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean hasUnread() {
    return pjsua2JNI.ContainerNode_hasUnread(swigCPtr, this);
  }

  public String unreadName() throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_unreadName(swigCPtr, this);
  }

  public int readInt(String name) throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readInt__SWIG_0(swigCPtr, this, name);
  }

  public int readInt() throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readInt__SWIG_1(swigCPtr, this);
  }

  public float readNumber(String name) throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readNumber__SWIG_0(swigCPtr, this, name);
  }

  public float readNumber() throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readNumber__SWIG_1(swigCPtr, this);
  }

  public boolean readBool(String name) throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readBool__SWIG_0(swigCPtr, this, name);
  }

  public boolean readBool() throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readBool__SWIG_1(swigCPtr, this);
  }

  public String readString(String name) throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readString__SWIG_0(swigCPtr, this, name);
  }

  public String readString() throws java.lang.Exception {
    return pjsua2JNI.ContainerNode_readString__SWIG_1(swigCPtr, this);
  }

  public StringVector readStringVector(String name) throws java.lang.Exception {
    return new StringVector(pjsua2JNI.ContainerNode_readStringVector__SWIG_0(swigCPtr, this, name), true);
  }

  public StringVector readStringVector() throws java.lang.Exception {
    return new StringVector(pjsua2JNI.ContainerNode_readStringVector__SWIG_1(swigCPtr, this), true);
  }

  public void readObject(PersistentObject obj) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_readObject(swigCPtr, this, PersistentObject.getCPtr(obj), obj);
  }

  public ContainerNode readContainer(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_readContainer__SWIG_0(swigCPtr, this, name), true);
  }

  public ContainerNode readContainer() throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_readContainer__SWIG_1(swigCPtr, this), true);
  }

  public ContainerNode readArray(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_readArray__SWIG_0(swigCPtr, this, name), true);
  }

  public ContainerNode readArray() throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_readArray__SWIG_1(swigCPtr, this), true);
  }

  public void writeNumber(String name, float num) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeNumber(swigCPtr, this, name, num);
  }

  public void writeInt(String name, int num) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeInt(swigCPtr, this, name, num);
  }

  public void writeBool(String name, boolean value) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeBool(swigCPtr, this, name, value);
  }

  public void writeString(String name, String value) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeString(swigCPtr, this, name, value);
  }

  public void writeStringVector(String name, StringVector arr) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeStringVector(swigCPtr, this, name, StringVector.getCPtr(arr), arr);
  }

  public void writeObject(PersistentObject obj) throws java.lang.Exception {
    pjsua2JNI.ContainerNode_writeObject(swigCPtr, this, PersistentObject.getCPtr(obj), obj);
  }

  public ContainerNode writeNewContainer(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_writeNewContainer(swigCPtr, this, name), true);
  }

  public ContainerNode writeNewArray(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.ContainerNode_writeNewArray(swigCPtr, this, name), true);
  }

  public ContainerNode() {
    this(pjsua2JNI.new_ContainerNode(), true);
  }

}
