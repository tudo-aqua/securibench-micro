// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks


package mock.sql;

import org.sosy_lab.sv_benchmarks.Tainting;

// Uses Tainting class to check for SQL-Injection
public class Statement {

    public void execute(String s) throws SQLException{
        Tainting.check(s, Tainting.SQL_INJECTION);
    }

    public void executeUpdate(String s, Object ... o) throws SQLException {
        Tainting.check(s, Tainting.SQL_INJECTION);
    }

    public void executeQuery(String s) {
        Tainting.check(s, Tainting.SQL_INJECTION);
    }
}
