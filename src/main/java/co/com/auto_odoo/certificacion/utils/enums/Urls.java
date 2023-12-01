package co.com.auto_odoo.certificacion.utils.enums;

public enum Urls {
//    URL_BASE("https://bitsamericas-16-qa-9354535.dev.odoo.com/");
    URL_BASE("http://odoo16-payroll.odoo.bitsamericas.net/web/login");
//    URL_BASE("http://odoo16-demo.odoo.bitsamericas.net/");
//    URL_BASE("http://odoo16-piloto.odoo.bitsamericas.net/");


    private final String url;

    Urls(String url) {
        this.url = url;
    }

//    public String getUrl() {
//        return url;
//    }

    @Override
    public String toString() { return url; }

}