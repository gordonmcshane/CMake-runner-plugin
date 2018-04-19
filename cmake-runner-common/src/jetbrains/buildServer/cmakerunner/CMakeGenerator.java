/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.buildServer.cmakerunner;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.TreeSet;

/**
 * @author Vladislav.Rassokhin
 */
@SuppressWarnings({"UnusedDeclaration"})
public class CMakeGenerator {
  @NotNull
  public static Collection<String> KNOWN_GENERATORS = new TreeSet<String>();

  static {
    KNOWN_GENERATORS.add("Default");
    KNOWN_GENERATORS.add("Visual Studio 15 2017");
    KNOWN_GENERATORS.add("Visual Studio 14 2015");
    KNOWN_GENERATORS.add("Visual Studio 12 2013");
    KNOWN_GENERATORS.add("Visual Studio 11 2012");
    KNOWN_GENERATORS.add("Visual Studio 10 2010");
    KNOWN_GENERATORS.add("Visual Studio 9 2008");
    KNOWN_GENERATORS.add("Visual Studio 8 2005");
    KNOWN_GENERATORS.add("Borland Makefiles");
    KNOWN_GENERATORS.add("NMake Makefiles");
    KNOWN_GENERATORS.add("NMake Makefiles JOM");
    KNOWN_GENERATORS.add("Green Hills MULTI");
    KNOWN_GENERATORS.add("MSYS Makefiles");
    KNOWN_GENERATORS.add("MinGW Makefiles");
    KNOWN_GENERATORS.add("Unix Makefiles");
    KNOWN_GENERATORS.add("Ninja");
    KNOWN_GENERATORS.add("Watcom WMake");
    KNOWN_GENERATORS.add("CodeBlocks - MinGW Makefiles");
    KNOWN_GENERATORS.add("CodeBlocks - NMake Makefiles");
    KNOWN_GENERATORS.add("CodeBlocks - NMake Makefiles JOM");
    KNOWN_GENERATORS.add("CodeBlocks - Ninja");
    KNOWN_GENERATORS.add("CodeBlocks - Unix Makefiles");
    KNOWN_GENERATORS.add("CodeLite - MinGW Makefiles");
    KNOWN_GENERATORS.add("CodeLite - NMake Makefiles");
    KNOWN_GENERATORS.add("CodeLite - Ninja");
    KNOWN_GENERATORS.add("CodeLite - Unix Makefiles");
    KNOWN_GENERATORS.add("Sublime Text 2 - MinGW Makefiles");
    KNOWN_GENERATORS.add("Sublime Text 2 - NMake Makefiles");
    KNOWN_GENERATORS.add("Sublime Text 2 - Ninja");
    KNOWN_GENERATORS.add("Sublime Text 2 - Unix Makefiles");
    KNOWN_GENERATORS.add("Kate - MinGW Makefiles");
    KNOWN_GENERATORS.add("Kate - NMake Makefiles");
    KNOWN_GENERATORS.add("Kate - Ninja");
    KNOWN_GENERATORS.add("Kate - Unix Makefiles");
    KNOWN_GENERATORS.add("Eclipse CDT4 - NMake Makefiles");
    KNOWN_GENERATORS.add("Eclipse CDT4 - MinGW Makefiles");
    KNOWN_GENERATORS.add("Eclipse CDT4 - Ninja");
  }
}
