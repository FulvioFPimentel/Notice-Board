import { useEffect, useState } from 'react';
import { View, Text, ScrollView, ActivityIndicator, Image } from 'react-native'
import { api } from '../services';
import { text, theme } from '../styles';
import { SupportType } from './Meetings';
import line from '../assets/icons/line.png';
import { DateDay, DateMonth, DateYear } from '../components/DateType';

type anyType = {
    a: any;
    b: any;
}

const Support: React.FC = () => {

    const [ supportData, setSupportData ] = useState<SupportType[]>([]);
    const [ loading, setLoading ] =  useState(false);

    async function fillSupport(){
        setLoading(true)
         const res = await api.get("/supports");
         setSupportData(res.data)
         setLoading(false)
    }

    supportData.sort((x, y) => (x.date < y.date) ? -1 : 1);

    useEffect(() => {
        fillSupport();
    },[])

    return (
        <ScrollView style={theme.container}>
            {loading ?
           
                <View style={theme.loadingPosition}>
                    <ActivityIndicator size="large" color="#9E9E9E"/>
                </View> : 
                <View>
                    
                    {supportData.map(a => {
                        
                        return (
                            <View style={theme.supportContainer}> 
                                <Text style={text.titleDetailsMeeting}>
                                    {DateDay(a.date)}/{DateMonth(a.date)}/{DateYear(a.date)}
                                </Text>
                                <Image source={line} style={theme.detailsLine} />

                                <View style={theme.boxMeetingDetails}>
                                {a.designations.map(b => {
                                    
                                    return(
                                        <View style={theme.boxDetailsInfo}>
                                            <Text style={text.supportAssignment}>
                                                {b.assignment} :
                                            </Text>
                                            <Text style={text.supportPerson}>
                                                {b.person}
                                            </Text>
                                        </View>
                                    )
                                   
                                })}
                                 </View>
                            </View>
                        )                             
                    })}
                </View>
            } 
        </ScrollView>

    );
}

export default Support;