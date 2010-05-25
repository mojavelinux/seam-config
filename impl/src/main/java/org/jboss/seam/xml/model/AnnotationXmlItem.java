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
package org.jboss.seam.xml.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnnotationXmlItem extends AbstractXmlItem
{
   HashSet<XmlItemType> allowed = new HashSet<XmlItemType>();

   public AnnotationXmlItem(XmlItem parent, Class<?> c, String innerText, Map<String, String> attributes, String document, int lineno)
   {
      super(XmlItemType.ANNOTATION, parent, c, innerText, attributes, document, lineno);
      if (innerText != null)
      {
         if (!innerText.trim().equals(""))
         {
            attributes.put("value", innerText);
         }
      }
      allowed.add(XmlItemType.ANNOTATION);
   }

   public Set<XmlItemType> getAllowedItem()
   {
      return allowed;
   }

}
