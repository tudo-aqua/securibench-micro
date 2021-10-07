// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

package mock.sql;

public class DriverManager {
    public static Connection getConnection(String connectionString) {
        return new Connection();
    }
}
