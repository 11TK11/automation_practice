using System;

namespace Core.Api
{
    public class ApiController
    {
        public ApiController()
        {
            
        }

        public T GetEndpoint<T>(string endpoint, string body="")
        {
            // call endpoint
            string response = string.Empty;//""
            return Json.<T>(response);
        }

        public T PostEndpoint<T>(string endpoint, string body="")
        {
            // call endpoint
            string response = string.Empty;//""
            return Json.<T>(response);
        }
        public T PutEndpoint<T>(string endpoint, string body="")
        {
            // call endpoint
            string response = string.Empty;//""
            return Json.<T>(response);
        }

        public T DeleteEndpoint<T>(string endpoint, string body="")
        {
            // call endpoint
            string response = string.Empty;//""
            return Json.<T>(response);
        }
    }
}