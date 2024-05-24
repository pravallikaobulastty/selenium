package api.endpoints;

public class Routes {
	
	public static String base_Url = "https://petstore.swagger.io/v2";
	
	//User module
	public static String post_url=base_Url+"/user";
	public static String get_url =base_Url+"/user/{username}";
	public static String put_url = base_Url+"/user/{username}";
	public static String delete_url = base_Url+"/user/{username}";
	
	//Pet Module
	public static String post_pet_url = base_Url+"/pet";
	public static String get_pet_url = base_Url+"/pet/{petId}";
	public static String put_pet_url = base_Url+"/pet";
	public static String delete_pet_url = base_Url+"/pet/{petId}";
	
	//Store Module
	public static String post_store_url = base_Url+"/store/order";
	public static String get_store_url = base_Url+"/store/order/{orderId}";
	public static String delete_store_url = base_Url+"/store/order/{orderId}";
	

}
