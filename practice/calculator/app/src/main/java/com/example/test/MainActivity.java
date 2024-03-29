package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputNumber;
    private EditText editText;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;

    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMulti;
    private Button buttonDivide;
    private Button buttonEquals;
    private Button buttonDot;
    private Button buttonClear;

    private double number1 = 0.0;
    private double number2 = 0.0;
    private double result = 0.0;
    private boolean wasDivisionBy0 = false;

    // TODO add new signs
    enum Sign {
        PLUS, EQUALS, MINUS, MULTI, DIVIDE
    }

    private Sign sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.numberInput);
        editText = findViewById(R.id.editText);

        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber9 = findViewById(R.id.buttonNumber9);
        buttonNumber0 = findViewById(R.id.buttonNumber0);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEquals = findViewById(R.id.buttonEquals);

        buttonDot = findViewById(R.id.buttonDot);

        buttonClear = findViewById(R.id.buttonClear);

        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);
        buttonNumber0.setOnClickListener(this);

        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);

        buttonDot.setOnClickListener(this);

        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (wasDivisionBy0) {
            Clear();
            wasDivisionBy0 = false;
        }
        switch (view.getId()) {
            case R.id.buttonNumber1: {
                if()
                if (!isDouble && inputNumber.getText().equals("")) {
                    Log.d("rng", "here");
                    inputNumber.setText("1");
                    editText.setText("1");
                } else {
                    inputNumber.append("1");
                    editText.append("1");
                }
                break;
            }
            case R.id.buttonNumber2: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("2");
                    editText.setText("2");
                } else {
                    inputNumber.append("2");
                    editText.append("2");
                }
                break;
            }
            case R.id.buttonNumber3: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("3");
                    editText.setText("3");
                } else {
                    inputNumber.append("3");
                    editText.append("3");
                }
                break;
            }
            case R.id.buttonNumber4: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("4");
                    editText.setText("4");
                } else {
                    inputNumber.append("4");
                    editText.append("4");
                }
                break;
            }
            case R.id.buttonNumber5: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("5");
                    editText.setText("5");
                } else {
                    inputNumber.append("5");
                    editText.append("5");
                }
                break;
            }
            case R.id.buttonNumber6: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("6");
                    editText.setText("6");
                } else {
                    inputNumber.append("6");
                    editText.append("6");
                }
                break;
            }
            case R.id.buttonNumber7: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("7");
                    editText.setText("7");
                } else {
                    inputNumber.append("7");
                    editText.append("7");
                }
                break;
            }
            case R.id.buttonNumber8: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("8");
                    editText.setText("8");
                } else {
                    inputNumber.append("8");
                    editText.append("8");
                }
                break;
            }
            case R.id.buttonNumber9: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("9");
                    editText.setText("9");
                } else {
                    inputNumber.append("9");
                    editText.append("9");
                }
                break;
            }
            case R.id.buttonNumber0: {
                if (!isDouble && !inputNumber.getText().equals("0")) {
                    inputNumber.setText("0");
                    editText.setText("0");
                } else {
                    inputNumber.append("0");
                    editText.append("0");
                }
                break;
            }
            case R.id.buttonPlus: {
                if (isDouble) {
                    doubleNumber1 = Double.parseDouble(inputNumber.getText().toString());
                } else {
                    number1 = Integer.parseInt(inputNumber.getText().toString());
                }
                inputNumber.setText("");
                editText.append("+");
                sign = Sign.PLUS;
                break;
            }
            case R.id.buttonMinus: {
                if (isDouble) {
                    doubleNumber1 = Double.parseDouble(inputNumber.getText().toString());
                } else {
                    number1 = Integer.parseInt(inputNumber.getText().toString());
                }
                inputNumber.setText("");
                editText.append("-");
                sign = Sign.MINUS;
                break;
            }
            case R.id.buttonMulti: {
                if (isDouble) {
                    doubleNumber1 = Double.parseDouble(inputNumber.getText().toString());
                } else {
                    number1 = Integer.parseInt(inputNumber.getText().toString());
                }
                inputNumber.setText("");
                editText.append("*");
                sign = Sign.MULTI;
                break;
            }
            case R.id.buttonDivide: {
                if (isDouble) {
                    doubleNumber1 = Double.parseDouble(inputNumber.getText().toString());
                } else {
                    number1 = Integer.parseInt(inputNumber.getText().toString());
                }
                inputNumber.setText("");
                editText.append("/");
                sign = Sign.DIVIDE;
                break;
            }
            case R.id.buttonDot: {
                isDouble = true;
                editText.append(".");
                inputNumber.append(".");
                break;
            }
            case R.id.buttonEquals: {
                if (isDouble) {
                    doubleNumber2 = Double.parseDouble(inputNumber.getText().toString());
                } else {
                    number2 = Integer.parseInt(inputNumber.getText().toString());
                }

                switch (sign) {
                    case PLUS: {
                        if (isDouble) {
                            doubleNumberResult = doubleNumber1 + doubleNumber2;
                        } else {
                            result = number1 + number2;
                        }
                        break;
                    }
                    case MINUS: {
                        if (isDouble) {
                            doubleNumberResult = doubleNumber1 - doubleNumber2;
                        } else {
                            result = number1 - number2;
                        }
                        break;
                    }
                    case MULTI: {
                        if (isDouble) {
                            doubleNumberResult = doubleNumber1 * doubleNumber2;
                        } else {
                            result = number1 * number2;
                        }
                        break;
                    }
                    case DIVIDE: {
                        if (number2 == 0 && doubleNumber2 == 0) {
                            wasDivisionBy0 = true;
                            editText.setText("cannot divide by zero");
                            return;
                        } else {
                            if (isDouble) {
                                doubleNumberResult = doubleNumber1 / doubleNumber2;
                            } else {
                                result = number1 / number2;
                            }
                        }

                        break;
                    }
                }

                if (isDouble) {
                    inputNumber.setText(String.valueOf(doubleNumberResult));
                    editText.setText(String.valueOf(doubleNumberResult));
                } else {
                    inputNumber.setText(String.valueOf(result));
                    editText.setText(String.valueOf(result));
                }
                break;
            }
            case R.id.buttonClear: {
                Clear();
            }
        }
    }

    private void Clear() {
        if (!wasDivisionBy0) {
            inputNumber.setText("");
        }
        editText.setText("");
        number1 = 0;
        number2 = 0;
        result = 0;
        doubleNumber1 = 0;
        doubleNumber2 = 0;
        doubleNumberResult = 0;
        isDouble = false;
    }
}