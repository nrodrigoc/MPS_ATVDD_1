package br.leitor.infrastructure.configuration.env;

public class Env {

    private Config config;

    public Env(){}

    public Env(Config config) {
        this.config = config;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public static class Config{
        private Database database;

        public Config(Database database) {
            this.database = database;
        }
        public Config() {}

        public Database getDatabase() {
            return database;
        }
        public void setDatabase(Database database) {
            this.database = database;
        }
    }

    public static class Database{
        private String url;
        private String port;
        private String db;
        private String user;
        private String password;

        public Database(String url, String port, String db,
                        String user, String password) {
            this.url = url;
            this.port = port;
            this.db = db;
            this.user = user;
            this.password = password;
        }

        public Database() {}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getDb() {
            return db;
        }

        public void setDb(String db) {
            this.db = db;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
