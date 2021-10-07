// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

package mockx.servlet.http;

public class Cookie {
    
	private String name;
	private String value;

    public Cookie(String name, String value) {
        this.name = name;
        this.value = value;
        
    }

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
    
}
