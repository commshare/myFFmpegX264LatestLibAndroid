/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.android.myffmpegx264lib;

public class exampleEncoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected exampleEncoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(exampleEncoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        exampleEncoderInterfaceJNI.delete_exampleEncoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public exampleEncoder() {
    this(exampleEncoderInterfaceJNI.new_exampleEncoder(), true);
  }

  public void initialize() {
    exampleEncoderInterfaceJNI.exampleEncoder_initialize(swigCPtr, this);
  }

  public void video_encode(byte[] inBytes, int frameSize, int counter, byte[] outBytes, int[] outFrameSize) {
    exampleEncoderInterfaceJNI.exampleEncoder_video_encode(swigCPtr, this, inBytes, frameSize, counter, outBytes, outFrameSize);
  }

  public void close() {
    exampleEncoderInterfaceJNI.exampleEncoder_close(swigCPtr, this);
  }

  public int getBitrate() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getBitrate(swigCPtr, this);
  }

  public void setBitrate(int bitrate) {
    exampleEncoderInterfaceJNI.exampleEncoder_setBitrate(swigCPtr, this, bitrate);
  }

  public int getFps() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getFps(swigCPtr, this);
  }

  public void setFps(int fps) {
    exampleEncoderInterfaceJNI.exampleEncoder_setFps(swigCPtr, this, fps);
  }

  public int getGopSize() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getGopSize(swigCPtr, this);
  }

  public void setGopSize(int gopSize) {
    exampleEncoderInterfaceJNI.exampleEncoder_setGopSize(swigCPtr, this, gopSize);
  }

  public int getHeight() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getHeight(swigCPtr, this);
  }

  public void setHeight(int height) {
    exampleEncoderInterfaceJNI.exampleEncoder_setHeight(swigCPtr, this, height);
  }

  public int getMaxBframes() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getMaxBframes(swigCPtr, this);
  }

  public void setMaxBframes(int maxBframes) {
    exampleEncoderInterfaceJNI.exampleEncoder_setMaxBframes(swigCPtr, this, maxBframes);
  }

  public int getWidth() {
    return exampleEncoderInterfaceJNI.exampleEncoder_getWidth(swigCPtr, this);
  }

  public void setWidth(int width) {
    exampleEncoderInterfaceJNI.exampleEncoder_setWidth(swigCPtr, this, width);
  }
  static{
		System.loadLibrary("ffmpeg-x264");
	}
}