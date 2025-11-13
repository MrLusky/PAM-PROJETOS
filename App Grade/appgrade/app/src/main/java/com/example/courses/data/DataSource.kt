/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, 2014, R.drawable.interestelar),
        Topic(R.string.automotive, 2010, R.drawable.origem),
        Topic(R.string.biology, 1999, R.drawable.matrix),
        Topic(R.string.crafts, 2001, R.drawable.tlotr),
        Topic(R.string.business, 1977, R.drawable.swiv),
        Topic(R.string.culinary, 1972, R.drawable.poderoso),
        Topic(R.string.design, 1999, R.drawable.clube),
        Topic(R.string.ecology, 1994, R.drawable.pulp),
        Topic(R.string.engineering, 2000, R.drawable.gladiador),
        Topic(R.string.fashion, 1998, R.drawable.resgate),
        Topic(R.string.finance, 1994, R.drawable.forrest),
        Topic(R.string.film, 1994, R.drawable.reileao),
        Topic(R.string.gaming, 1995, R.drawable.toystory),
        Topic(R.string.geology, 2008, R.drawable.ironman),
        Topic(R.string.drawing, 2008, R.drawable.darkknight),
        Topic(R.string.history, 2019, R.drawable.avengers),
        Topic(R.string.journalism, 2018, R.drawable.pantera),
        Topic(R.string.law, 1997, R.drawable.titanic),
        Topic(R.string.lifestyle, 2009, R.drawable.avatar),
        Topic(R.string.music, 1991, R.drawable.exterminador),
        Topic(R.string.painting, 1985, R.drawable.futuro),
        Topic(R.string.photography, 1993, R.drawable.jurassic),
        Topic(R.string.physics, 2019, R.drawable.coringa),
        Topic(R.string.tech, 2023, R.drawable.oppenheimer),
    )
}
