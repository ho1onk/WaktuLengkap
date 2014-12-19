Calendar c1 = Calendar.getInstance();
            SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/yyyy h:m:s a"); // a <-- format waktu pm or am
               //SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss"); <-- ini untuk waktu aja ga ikut tgl,bulan, tahun
               String strdate1 = sdf1.format(c1.getTime());
               TextView txtdate1 = (TextView) findViewById(R.id.textView1);
               txtdate1.setText(strdate1); 
