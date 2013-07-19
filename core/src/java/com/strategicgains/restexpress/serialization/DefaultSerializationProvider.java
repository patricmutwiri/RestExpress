/*
    Copyright 2013, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.restexpress.serialization;

import com.strategicgains.restexpress.response.RawResponseWrapper;
import com.strategicgains.restexpress.serialization.json.JacksonJsonProcessor;
import com.strategicgains.restexpress.serialization.xml.XstreamXmlProcessor;


/**
 * The default serialization provider that uses Jackson for JSON and XStream for XML serialization/deserialization.
 * 
 * @author toddf
 * @since Jul 18, 2013
 */
public class DefaultSerializationProvider
extends AbstractSerializationProvider
{
	public DefaultSerializationProvider()
    {
		super();
		add(new JacksonJsonProcessor(), new RawResponseWrapper(), true);
		add(new XstreamXmlProcessor(), new RawResponseWrapper());
    }
}
