/*
 * Copyright 2018 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apereo.openequella.tools.toolbox;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ConfigTest {
	@Test
	public void testConfigDateFormatOeqApi() {
		String date = "2013-01-18T11:39:07.290-07:00";
		try {
			Config.DATE_FORMAT_OEQ_API.parse(date);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testConfigDateFormatConfigFile() {
		String date = "2013-01-18";
		try {
			Config.DATE_FORMAT_CONFIG_FILE.parse(date);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
}
