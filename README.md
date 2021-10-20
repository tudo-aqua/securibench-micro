<!--
This file is part of the SV-Benchmarks collection of verification tasks:
https://github.com/sosy-lab/sv-benchmarks

SPDX-FileCopyrightText: 2021 The SV-Benchmarks Community

SPDX-License-Identifier: Apache-2.0
-->

# SVComp benchmark instances based on Securibench Micro

The project provides a script for generating SVComp benchmark instances
from Securibench Micro benchmark instances.
The original securibench is copyright 2006 Benjamin Livshits
and, licensed under the Apache License, Version 2.0 (the "License"):

- http://too4words.github.io/securibench-micro/

## Securibench Micro

We are happy to announce that version 1.08 of Securibench Micro has been released. Unlike Securibench, which contains large, real-life applications, Securibench Micro is a series of small test cases designed to excercise different parts of a static security analyzer. Each test case in Securibench Micro comes with an answer, which simplifies the comparison process.

All test cases included in this release can be installed on a standard application server such as Tomcat. So, in addition to using test cases contained in Securibench Micro to put a static analyser thorough its paces, Securibench Micro may be used to compare the effectiveness of runtime techniques such as penetration testing tools.
These test cases suffer from a variety of vulnerabilities including

* SQL injection attacks
* Cross-site scripting attacks
* HTTP splitting attacks
* Path traversal attacks
and potentially many others.

After years of being hosted at <a href='http://suif.stanford.edu/~livshits/work/securibench-micro/'>Stanford</a>, we're now moving to Github.
