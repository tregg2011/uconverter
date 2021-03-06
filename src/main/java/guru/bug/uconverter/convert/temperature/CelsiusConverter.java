/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.temperature;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class CelsiusConverter extends AbstractTemperatureConverter {

    @Override
    public String getUnitName() {
        return "Celsius";
    }

    @Override
    public double toStandard(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double fromStandard(double kelvin) {
        return kelvin - 273.15;
    }
}
