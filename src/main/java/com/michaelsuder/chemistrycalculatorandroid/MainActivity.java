package com.michaelsuder.chemistrycalculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] elements = { "Hydrogen, H", "Helium, He", "Lithium, Li", "Beryllium, Be", "Boron, B", "Carbon, C",
            "Nitrogen, N", "Oxygen, O", "Fluorine, F", "Neon, N", "Sodium, Na", "Magnesium, Mg", "Aluminum, Al",
            "Silicon, Si", "Phosphorus, P", "Sulfur, S", "Chlorine, Cl", "Argon Ar", "Potassium, K", "Calcium, Ca",
            "Scandium, Sc", "Titanium, Ti", "Vanadium, V", "Chromium, Cr", "Manganese, Mn", "Iron, Fe", "Cobalt, Co",
            "Nickel, Ni", "Copper, Cu", "Zinc, Zn", "Gallium, Ga", "Germanium, Ge", "Arsenic, As", "Selenium, Se",
            "Bromine, Br", "Krypton, Kr", "Rubidium, Rb", "Strontium, Sr", "Yttrium, Y", "Zirconium, Zr", "Niobium, Nb",
            "Molybdenum, Mo", "Technetium, Tc", "Ruthenium, Ru", "Rhodium, Rh", "Palladium, Pd", "Silver, Ag",
            "Cadmium, Cd", "Indium, In", "Tin, Sn", "Antimony, Sb", "Tellurium, Te", "Iodine, I", "Xenon, Xe",
            "Cesium, Cs", "Barium, Ba", "Lanthanum, La", "Cerium, Ce", "Praseodymium, pr", "Neodymium, Nd",
            "Promethium, Pm", "Samarium, Sm", "Europium, Eu", "Gadolinium, Gd", "Terbium, Tb", "Dysprosium, Dy",
            "Holmium, Ho", "Erbium, Er", "Thulium, Tm", "Ytterbium, Yb", "Lutetium, Lu", "Hafnium, Hf", "Tantalum, Ta",
            "Tungsten, W", "Rhenium, Re", "Osmium, Os", "Iridium, Ir", "Platinum, Pt", "Gold, Au", "Mercury, Hg",
            "Thallium, Tl", "Lead, Pb", "Bismuth, Bi", "Polonium, Po", "Astatine, At", "Radon, Rn", "Francium, Fr",
            "Radium, Ra", "Actinium, Ac", "Thorium, Th", "Protactinium, Pa", "Uranium, U", "Neptunium, Np",
            "Plutonium, Pu", "Americium, Am", "Curium, Cm", "Berkelium, Bk", "Californium, Cf", "Einsteinium, Es",
            "Fermium, Fm", "Mendelevium, Md", "Nobelium, No", "Lawrencium, Lr", "Rutherfordium, Rf", "Dubnium, Db",
            "Seaborgium, Sg", "Bohrium, Bh", "Hassium, Hs", "Meitnerium, Mt", "Darmstadtium, Ds", "Roentgenium, Rg",
            "Copernicium, Cn", "Nihonium, Nh", "Flerovium, Fl", "Moscovium, Mc", "Livermorium, Lv", "Tennessine, Ts",
            "Oganesson, Og", };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void atomicSymbolBtnClick(View v) {
        TextView txtResult = findViewById(R.id.txtResult);
        EditText edtTxtAtomicSymbol = findViewById(R.id.edtTxtAtmoicSymbol);
        txtResult.setText("Result Found: " + getElementName(edtTxtAtomicSymbol.getText().toString()));
    }

    public void elementNameBtnClick(View v) {
        TextView txtResult = findViewById(R.id.txtResult);
        EditText edtTxtElementName = findViewById(R.id.edtTxtElementName);
        txtResult.setText("Result Found: " + elementName(edtTxtElementName.getText().toString()));
    }

    public String getElementName(String element) {
        for (int i = 0; i < elements.length; i++) {
            if (element.equals(elements[i].substring(elements[i].length() - element.length()))) {
                return elements[i];
            }
        }
        return "Element not found check spelling or capitalization. . .";
    }

    public String elementName(String element) {
        for (String s : elements) {
            if (s.contains(element)) {
                return s.substring(element.length() + 2);
            }
        }
        return "Enter a valid element";
    }
}