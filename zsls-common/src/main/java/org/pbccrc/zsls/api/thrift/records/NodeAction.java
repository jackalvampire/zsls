/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.pbccrc.zsls.api.thrift.records;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum NodeAction implements org.apache.thrift.TEnum {
  NORMAL(0),
  NOT_MASTER(1),
  INVALID(2),
  RE_REGISTER(3);

  private final int value;

  private NodeAction(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NodeAction findByValue(int value) { 
    switch (value) {
      case 0:
        return NORMAL;
      case 1:
        return NOT_MASTER;
      case 2:
        return INVALID;
      case 3:
        return RE_REGISTER;
      default:
        return null;
    }
  }
}
