public class LockedSlogan implements Lockable{
        public int count = 0;
        private String phrase;
        private int key = 0;
        private boolean locked = true;

        public void Slogan(String str){
            phrase = str;
            count++;
        }

        public String toString(){
            return phrase;
        }

        public int getCount() {
            return count;
        }

        public void setKey(int key){
            this.key = key;
        }

        public void lock(int key){
            if(key == this.key)
                this.locked = true;
        }

        public void unlock(int key){
            if(key == this.key)
                this.locked = false;
        }

        public boolean locked(){
            return locked;
        }
    }

