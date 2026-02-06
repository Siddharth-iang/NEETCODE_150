if(nums.length==0){
            return 0;
        }
        
       int count = 1;
       int maxLength = 1;

       Arrays.sort(nums);

       for(int i=1; i<nums.length; i++){

        if(nums[i]==nums[i-1]){
            continue;
        }

        if(nums[i] == 1 + nums[i-1]){
            count++;
        }
        else{
            count = 1;
        }

        maxLength = Math.max(maxLength, count);
       }
       return maxLength;
