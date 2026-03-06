
    public void jogar(View view) {
        long numero;
        TextView txtNumeroMaximo = findViewById(R.id.textNumeroMaximo);
        TextView txtNumero = findViewById(R.id.txtNumeroSorteado);
        numero = Math.round(Math.random() * Long.parseLong(txtNumeroMaximo.getText().toString()));
        txtNumero.setText(String.valueOf(numero));

        Toast.makeText(this, "Número sorteado: " + numero, Toast.LENGTH_SHORT).show();

        mostrarAlerta(numero);
    }

    public void mostrarAlerta(long numero) {
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Sorteio");
        alerta.setMessage("Numero sorteado: " + numero);
        alerta.setCancelable(false);

        alerta.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        alerta.create();
        alerta.show();

        }
    }
