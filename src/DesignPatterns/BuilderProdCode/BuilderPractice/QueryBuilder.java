package DesignPatterns.BuilderProdCode.BuilderPractice;

public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder(Builder builder){
        // Validations and assignment here
        // Validations and assignment here
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        private Builder(){

        }

        public QueryBuilder build(){
            return new QueryBuilder(this);
        }

        public Builder setSelect(String select){
            this.select = select;
            return this;
        }

        public Builder setFrom(String from){
            this.from = from;
            return this;
        }

        public Builder setWhere(String where){
            this.where = where;
            return this;
        }

        public Builder setJoin(String join){
            this.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy){
            this.orderBy = orderBy;
            return this;
        }

        public Builder setGroupBy(String groupBy){
            this.groupBy = groupBy;
            return this;
        }
    }

}