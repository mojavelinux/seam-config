/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.seam.xml.test.fieldset;

import java.math.BigDecimal;

import org.jboss.seam.xml.test.method.QualifierEnum;

public class FieldValueBean
{

   public void init()
   {
      assert ivalue != 20;
   }

   private int ivalue = 20;

   public String stringValue;

   public QualifierEnum enumValue;

   public boolean bvalue;

   public float fvalue = 1;

   public double dvalue = 1;

   private BigDecimal bigDecimalValue;

   public BigDecimal readBigDecimalValue()
   {
      return bigDecimalValue;
   }

   public short svalue;

   public long lvalue;

   public String elValue;

   public String elInnerTextValue;

   int noFieldValue;

   public void setIvalue(int value)
   {
      this.ivalue = value + 1;
   }

   public int getIvalue()
   {
      return ivalue;
   }

   public int getNoField()
   {
      return noFieldValue;
   }

   public void setNoField(int value)
   {
      noFieldValue = value;
   }

}
