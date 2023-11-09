package com.kelvin.api.client.models.response

trait BaseResponse {
    def s: String
    def code: Int
    def message: String
        
}
